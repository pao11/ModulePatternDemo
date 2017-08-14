package com.pao11.girls.main;

import android.os.Bundle;

import com.github.mzule.activityrouter.annotation.Router;
import com.pao11.common.base.BaseActionBarActivity;
import com.pao11.girls.R;

@Router("girls")
public class GirlsActivity extends BaseActionBarActivity {

    private GirlsView mView;
    private GirlsContract.Presenter mPresenter;

    @Override
    protected int setTitleId() {
        return R.string.girls_activity_title;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = new GirlsView(this);
        setContentView(mView);
        mPresenter = new GirlsPresenter(mView);
        mPresenter.start();
    }


}
