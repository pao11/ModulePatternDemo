package com.pao11.news.main;

import com.pao11.common.base.BasePresenter;
import com.pao11.common.base.BaseView;
import com.pao11.news.data.bean.StoryList;

/**
 * <p>类说明</p>
 *
 * @author pao11 2017/2/22 20:33
 * @version V1.2.0
 * @name NewsContract
 */
public interface NewsListContract {

    interface View extends BaseView<Presenter> {

        boolean isActive();

        void showNewsList(StoryList info);

    }

    interface Presenter extends BasePresenter {

        /**
         * 获取最新列表
         *
         * @param date
         */
        void getNewMessages(int page, int size, String date);

    }

}
