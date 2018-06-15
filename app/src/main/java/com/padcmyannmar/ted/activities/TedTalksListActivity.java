package com.padcmyannmar.ted.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.padcmyannmar.ted.R;
import com.padcmyannmar.ted.adapters.TedTalksAdapter;
import com.padcmyannmar.ted.data.models.TedTalksModel;
import com.padcmyannmar.ted.delegates.TedTalksDelegate;

public class TedTalksListActivity extends BaseActivity implements TedTalksDelegate {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ted_talks_list);

        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView rvNews = findViewById(R.id.rv_news);
        TedTalksAdapter tedTalksAdapter = new TedTalksAdapter(this);
        rvNews.setAdapter(tedTalksAdapter);
        rvNews.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));

        //Load Response Data
        TedTalksModel.getObjInstance().loadTalksList();

    }

    @Override
    public void onTapNews() {
        Intent intent = new Intent(getApplicationContext(),TedTalksDetailsActivity.class);
        startActivity(intent);
    }

    @Override
    public void onTapFavorite() {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
