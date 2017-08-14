package com.pao11.news.detail;

import com.pao11.common.base.InfoCallback;
import com.pao11.news.data.NewsDataSource;
import com.pao11.news.data.bean.MessageDetail;
import com.pao11.news.data.source.RemoteNewsDataSource;

/**
 * <p>类说明</p>
 *
 * @author pao11 2017/2/22 20:33
 * @version V1.2.0
 * @name GirlsPresenter
 */
public class NewsDetailPresenter implements NewsDetailContract.Presenter {

    private NewsDetailContract.View mView;
    private NewsDataSource mDataSource;

    public NewsDetailPresenter(NewsDetailContract.View view) {
        mView = view;
        mDataSource = new RemoteNewsDataSource();
        mView.setPresenter(this);
    }

    @Override
    public void start() {

    }


    @Override
    public void getNewsDetail(String newsId) {
        mDataSource.getNewsDetail(newsId, new InfoCallback<MessageDetail>() {
            @Override
            public void onSuccess(MessageDetail detail) {
                if (mView.isActive()) {
                    mView.showNewsDetail(detail);
                }
            }

            @Override
            public void onError(int code, String message) {

            }
        });
    }

}
