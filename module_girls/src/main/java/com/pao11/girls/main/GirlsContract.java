package com.pao11.girls.main;

import com.pao11.common.base.BasePresenter;
import com.pao11.common.base.BaseView;
import com.pao11.girls.data.bean.Girls;

import java.util.List;

/**
 * <p>类说明</p>
 *
 * @author pao11 2017/2/22 20:33
 * @version V1.2.0
 * @name GirlsContract
 */
public interface GirlsContract {

    interface View extends BaseView<Presenter> {

        /**
         * View 的存活状态
         *
         * @return true or false
         */
        boolean isActive();

        void refresh(List<Girls> data);

        void load(List<Girls> data);

        void showError();

        void showNormal();

    }

    interface Presenter extends BasePresenter {

        void getGirls(int page, int size, boolean isRefresh);

    }


}
