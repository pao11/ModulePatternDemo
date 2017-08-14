package com.pao11.girls.data.source;


import com.pao11.common.http.DataType;
import com.pao11.common.http.HttpClient;
import com.pao11.common.http.OnResultListener;
import com.pao11.girls.Constants;
import com.pao11.girls.data.GirlsDataSource;
import com.pao11.girls.data.bean.GirlsParser;



public class RemoteGirlsDataSource implements GirlsDataSource {

    @Override
    public void getGirls(int size, int page, final LoadGirlsCallback callback) {
        HttpClient client = new HttpClient.Builder()
                .baseUrl(Constants.GAN_HUO_API)
                .url("福利/" + size + "/" + page)
                .bodyType(DataType.JSON_OBJECT, GirlsParser.class)
                .build();
        client.get(new OnResultListener<GirlsParser>() {

            @Override
            public void onSuccess(GirlsParser result) {
                callback.onGirlsLoaded(result);
            }

            @Override
            public void onError(int code, String message) {
                callback.onDataNotAvailable();
            }

            @Override
            public void onFailure(String message) {
                callback.onDataNotAvailable();
            }
        });
    }

}
