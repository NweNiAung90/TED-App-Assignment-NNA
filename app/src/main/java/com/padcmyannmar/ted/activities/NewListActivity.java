package com.padcmyannmar.ted.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.padcmyannmar.ted.R;
import com.padcmyannmar.ted.adapters.NewsAdapter;
import com.padcmyannmar.ted.delegates.NewsDelegate;

public class NewListActivity extends BaseActivity implements NewsDelegate{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_list);

        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        RecyclerView rvNews = findViewById(R.id.rv_news);
        NewsAdapter newsAdapter = new NewsAdapter(this);
        rvNews.setAdapter(newsAdapter);
        rvNews.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));
    }

    @Override
    public void onTapNews() {
        Intent intent = new Intent(getApplicationContext(),NewsDetailsActivity.class);
        startActivity(intent);
    }

    @Override
    public void onTabFavorite() {

    }
}
