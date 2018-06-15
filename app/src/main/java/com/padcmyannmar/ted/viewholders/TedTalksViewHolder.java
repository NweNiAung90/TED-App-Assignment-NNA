package com.padcmyannmar.ted.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.padcmyannmar.ted.delegates.TedTalksDelegate;

public class TedTalksViewHolder extends RecyclerView.ViewHolder {
    private TedTalksDelegate mTedTalksDelegate;

    public TedTalksViewHolder(View itemView, TedTalksDelegate tedTalksDelegate) {
        super(itemView);
        mTedTalksDelegate = tedTalksDelegate;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTedTalksDelegate.onTapNews();
            }
        });
    }
}
