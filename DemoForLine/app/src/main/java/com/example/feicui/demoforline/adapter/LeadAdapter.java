package com.example.feicui.demoforline.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.example.feicui.demoforline.pagerInfo.lead_pager0;
import com.example.feicui.demoforline.pagerInfo.lead_pager1;
import com.example.feicui.demoforline.pagerInfo.lead_pager2;

/**
 * Created by apple on 2016/7/26.
 */
public class LeadAdapter extends PagerAdapter {
    private final View[] views;

    public LeadAdapter(Context context) {
        views = new View[]{
                new lead_pager0(context),
                new lead_pager1(context),
                new lead_pager2(context)
        };
    }

    @Override public int getCount() {
        return views.length;
    }

    @Override public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override public Object instantiateItem(ViewGroup container, int position) {
        container.addView(views[position], 0);
        return views[position];
    }

    @Override public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
