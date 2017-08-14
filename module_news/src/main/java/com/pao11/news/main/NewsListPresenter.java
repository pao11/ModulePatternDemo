package com.pao11.news.main;

import com.pao11.common.base.InfoCallback;
import com.pao11.news.data.NewsDataSource;
import com.pao11.news.data.bean.StoryList;
import com.pao11.news.data.source.RemoteNewsDataSource;

/**
 * <p>类说明</p>
 *
 * @author pao11 2017/2/22 20:33
 * @version V1.2.0
 * @name GirlsPresenter
 */
public class NewsListPresenter implements NewsListContract.Presenter {

    private NewsListContract.View mView;
    private NewsDataSource mDataSource;

    public NewsListPresenter(NewsListContract.View view) {
        mView = view;
        mDataSource = new RemoteNewsDataSource();
        mView.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void getNewMessages(int page, int size, String date) {
        mDataSource.getNewsList(date, new InfoCallback<StoryList>() {
            @Override
            public void onSuccess(StoryList info) {
                if (mView.isActive()) {
                    mView.showNewsList(info);
                }
            }

            @Override
            public void onError(int code, String message) {

            }
        });
    }
}
