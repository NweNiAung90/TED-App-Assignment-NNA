package com.padcmyannmar.ted.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.widget.TextView;

import com.padcmyannmar.ted.R;
import com.padcmyannmar.ted.adapters.WatchNextTedTalksAdapter;

public class TedTalksDetailsActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ted_talks_details);

        TextView txtView = (TextView)findViewById(R.id.tv_news_details);
        String text = "<font color=#212121>Cherry blossoms and rainbows, bubbles and googly eyes: Why do some things seem to create such a universal joy? In this captivating talk, Ingrid Fetell Lee reveals the surprisingly tangible roots of joy and shows how we all can find  -- and create -- more of it in the world around us.</font> <font color=#757575>TED2018, Flimed Apr 2018</font>";
        txtView.setText(Html.fromHtml(text));

        RecyclerView rvNews = findViewById(R.id.rv_news);
        WatchNextTedTalksAdapter newsAdapter = new WatchNextTedTalksAdapter();
        rvNews.setAdapter(newsAdapter);
        rvNews.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));
    }
}
