package com.pao11.girls.data;

import com.pao11.girls.data.bean.GirlsParser;

public interface GirlsDataSource {

    interface LoadGirlsCallback {

        void onGirlsLoaded(GirlsParser girlsParser);

        void onDataNotAvailable();
    }

    void getGirls(int size, int page, LoadGirlsCallback callback);

}
