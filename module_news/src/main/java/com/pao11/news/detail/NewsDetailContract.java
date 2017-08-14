package com.pao11.news.detail;

import com.pao11.common.base.BasePresenter;
import com.pao11.common.base.BaseView;
import com.pao11.news.data.bean.MessageDetail;

/**
 * <p>类说明</p>
 *
 * @author pao11 2017/2/22 20:33
 * @version V1.2.0
 * @name NewsContract
 */
public interface NewsDetailContract {

    interface View extends BaseView<Presenter> {

        boolean isActive();

        void showNewsDetail(MessageDetail detail);

    }

    interface Presenter extends BasePresenter {

        /**
         * 获取最新列表
         *
         * @param newsId 新闻id
         */
        void getNewsDetail(String newsId);

    }

}
