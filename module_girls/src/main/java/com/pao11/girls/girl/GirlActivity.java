package com.pao11.girls.girl;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.WindowManager;

import com.pao11.common.HackyViewPager;
import com.pao11.common.base.BaseActivity;
import com.pao11.girls.Constants;
import com.pao11.girls.data.bean.Girls;

import java.util.List;

/**
 * <p> </p>
 *
 * @author pao11 2017/5/19 20:24
 * @version V1.1
 * @name GirlActivity
 */
public class GirlActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
        if (getIntent() != null) {
            List<Girls> mData = getIntent().getParcelableArrayListExtra(Constants.INTENT_GIRLS);
            int mCurrentIndex = getIntent().getIntExtra(Constants.INTENT_INDEX, 0);
            HackyViewPager viewPager = new HackyViewPager(this);
            setContentView(viewPager);
            GirlAdapter adapter = new GirlAdapter(this, mData);
            viewPager.setAdapter(adapter);
            viewPager.setCurrentItem(mCurrentIndex);
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {

                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        }
    }

}
