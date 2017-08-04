package com.example.mvpframe.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.libflycobanner.indicator.FlyPageIndicator;
import com.example.libutil.ToastUtils;
import com.example.mvpframe.R;
import com.example.mvpframe.ui.SimpleImageBanner;
import com.example.mvpframe.util.BannerDataProvider;
import com.example.mvpframe.util.ToolbarUtils;
import com.flyco.banner.widget.Banner.base.BaseBanner;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DiscoverFragment extends Fragment {

    public static final String TAG = "DiscoverFragment";

    private static DiscoverFragment fragment;
    @Bind(R.id.simpleBanner)
    SimpleImageBanner mSimpleBanner;
    @Bind(R.id.OutIndicatorBanner)
    SimpleImageBanner mOutIndicatorBanner;
    @Bind(R.id.indicatorRes)
    FlyPageIndicator mIndicatorRes;

    public static DiscoverFragment newInstance() {
        if (null == fragment) {
            fragment = new DiscoverFragment();
        }
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discover, container, false);
        initTitle(view);
        ButterKnife.bind(this, view);
        initSimpleBanner();
        initOutIndicatorBanner();
        return view;
    }

    private void initTitle(View view) {
        View header = view.findViewById(R.id.header_btn_layout);
        ToolbarUtils toolbar = new ToolbarUtils(getActivity(), header);
        toolbar.initTitle("发现");
        toolbar.initMenuClick(ToolbarUtils.NO_ICON, "编辑", null, ToolbarUtils.NO_ICON, "", null);
        TextView tv = (TextView) view.findViewById(R.id.headerMenu2);
        tv.setTextColor(Color.DKGRAY);
    }

    private void initSimpleBanner() {
        mSimpleBanner.setIndicatorStyle(SimpleImageBanner.STYLE_DRAWABLE_RESOURCE)
                .setIndicatorSelectorRes(R.mipmap.banner_point_unselect, R.mipmap.banner_point_select)
                .setSource(BannerDataProvider.getList())
                .startScroll();
        mSimpleBanner.setOnItemClickL(new SimpleImageBanner.OnItemClickL() {
            @Override
            public void onItemClick(int position) {
                ToastUtils.show(getActivity(), "position--->" + position);
            }
        });
    }

    private void initOutIndicatorBanner() {
        mOutIndicatorBanner
                .setIndicatorShow(false)
                .setSource(BannerDataProvider.getList())
                .startScroll();
        mOutIndicatorBanner.setOnItemClickL(new BaseBanner.OnItemClickL() {
            @Override
            public void onItemClick(int position) {
                ToastUtils.show(getActivity(), "position--->" + position);
            }
        });
        //设置指示器
        mIndicatorRes.setIsSnap(true)
                     .setViewPager(mOutIndicatorBanner.getViewPager(),BannerDataProvider.getList().size());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
