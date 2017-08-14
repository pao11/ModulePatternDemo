package com.pao11.news.data;

import com.pao11.common.base.InfoCallback;
import com.pao11.news.data.bean.MessageDetail;
import com.pao11.news.data.bean.StoryList;

/**
 * <p>类说明</p>
 *
 * @author pao11 2017/4/20 22:02
 * @version V1.2.0
 * @name NewsDataSource
 */
public interface NewsDataSource {


    /**
     * 获取当天的新闻列表
     *
     * @param date     日期
     * @param callback 回调
     */
    void getNewsList(String date, InfoCallback<StoryList> callback);

    /**
     * 获取某条新闻详情
     *
     * @param id       新闻Id
     * @param callback 回调
     */
    void getNewsDetail(String id, InfoCallback<MessageDetail> callback);

}

