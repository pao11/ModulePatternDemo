package com.pao11.news.data.source;

import com.pao11.common.base.InfoCallback;
import com.pao11.common.http.DataType;
import com.pao11.common.http.HttpClient;
import com.pao11.common.http.OnResultListener;
import com.pao11.news.Constants;
import com.pao11.news.data.NewsDataSource;
import com.pao11.news.data.bean.MessageDetail;
import com.pao11.news.data.bean.StoryList;

/**
 * <p>类说明</p>
 *
 * @author pao11 2017/4/20 23:32
 * @version V1.2.0
 * @name RemoteNewsDataSource
 */
public class RemoteNewsDataSource implements NewsDataSource {

    @Override
    public void getNewsList(String date, final InfoCallback<StoryList> callback) {
        HttpClient client = new HttpClient.Builder()
                .baseUrl(Constants.ZHIHU_DAILY_BEFORE_MESSAGE)
                .url(date)
                .bodyType(DataType.JSON_OBJECT, StoryList.class)
                .build();
        client.get(new OnResultListener<StoryList>() {

            @Override
            public void onSuccess(StoryList result) {
                callback.onSuccess(result);
            }

            @Override
            public void onError(int code, String message) {
                callback.onError(code, message);
            }

            @Override
            public void onFailure(String message) {
                callback.onError(0, message);
            }
        });
    }


    @Override
    public void getNewsDetail(String id, final InfoCallback<MessageDetail> callback) {
        HttpClient client = new HttpClient.Builder()
                .baseUrl(Constants.ZHIHU_DAILY_BEFORE_MESSAGE_DETAIL)
                .url(id)
                .bodyType(DataType.JSON_OBJECT, MessageDetail.class)
                .build();
        client.get(new OnResultListener<MessageDetail>() {

            @Override
            public void onSuccess(MessageDetail result) {
                callback.onSuccess(result);
            }

            @Override
            public void onError(int code, String message) {
                callback.onError(code, message);
            }

            @Override
            public void onFailure(String message) {
                callback.onError(0, message);
            }
        });
    }


}
