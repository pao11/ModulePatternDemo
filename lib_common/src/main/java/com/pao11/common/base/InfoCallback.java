package com.pao11.common.base;

/**
 * <p>数据回调接口</p>
 *
 * @author pao11 2017/3/22 13:36
 * @version V1.2.0
 * @name InfoCallback
 */
public interface InfoCallback<T> {

    void onSuccess(T info);

    void onError(int code, String message);

}
