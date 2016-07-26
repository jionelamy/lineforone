package com.example.feicui.demoforline.pagerInfo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.example.feicui.demoforline.R;

/**
 * Created by apple on 2016/7/26.
 */
public class lead_pager0 extends FrameLayout {
    public lead_pager0(Context context) {
        this(context, null);
    }

    public lead_pager0(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public lead_pager0(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.fragment_lead_pager1, this, true);
    }


}

