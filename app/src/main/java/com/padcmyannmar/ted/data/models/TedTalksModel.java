package com.padcmyannmar.ted.data.models;

import com.padcmyannmar.ted.network.HttpUrlConnectionDataAgentImpl;
import com.padcmyannmar.ted.network.TedTalksDataAgent;

public class TedTalksModel {

    private static final String DUMMY_ACCESS_TOKEN = "b002c7e1a528b7cb460933fc2875e916";

    private static TedTalksModel objInstance;

    private TedTalksDataAgent mDataAgent;

    private TedTalksModel(){
        mDataAgent = HttpUrlConnectionDataAgentImpl.getObjInstance();
    }

    public static TedTalksModel getObjInstance() {
        /*Factory Logic
         * only one obj for this class type
         */
        if( objInstance == null){
            objInstance = new TedTalksModel();
        }
        return objInstance;
    }

    public void loadTalksList(){
        mDataAgent.loadTalksList(DUMMY_ACCESS_TOKEN,1);

    }
}
