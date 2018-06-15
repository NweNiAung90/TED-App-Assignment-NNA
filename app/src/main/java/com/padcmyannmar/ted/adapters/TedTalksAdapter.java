package com.padcmyannmar.ted.adapters;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyannmar.ted.R;
import com.padcmyannmar.ted.delegates.TedTalksDelegate;
import com.padcmyannmar.ted.viewholders.TedTalksViewHolder;

public class TedTalksAdapter extends RecyclerView.Adapter {
    private TedTalksDelegate mTedTalksDelegate;

    public TedTalksAdapter(TedTalksDelegate tedTalksDelegate){
        mTedTalksDelegate = tedTalksDelegate;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.view_holder_ted_talks,parent,false);
        return new TedTalksViewHolder(view, mTedTalksDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }
}
