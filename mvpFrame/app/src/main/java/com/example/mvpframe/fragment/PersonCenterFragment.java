package com.example.mvpframe.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.libutil.SharedFileUtils;
import com.example.mvpframe.R;
import com.example.mvpframe.util.TabEntity;
import com.example.mvpframe.util.ToolbarUtils;
import com.example.mvpframe.util.TopTabUtils;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PersonCenterFragment extends Fragment {

    public static final String TAG = "PersonCenterFragment";

    private static PersonCenterFragment fragment;

    private static FragmentManager mFragmentManager;
    private SharedFileUtils sp;

    @Bind(R.id.commonTabLayout)
    CommonTabLayout mCommonTabLayout;

    public static PersonCenterFragment newInstance() {
        if (null == fragment) {
            fragment = new PersonCenterFragment();
        }
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_person_center, container, false);
        ButterKnife.bind(this, view);
        initTitle(view);
        initTab();
        sp = new SharedFileUtils(getActivity());
        mFragmentManager = getChildFragmentManager();
        goToFragment(sp.getInt(SharedFileUtils.TOP_CURRENT_FRAGMENT_TAB));
        return view;
    }

    private void initTitle(View view) {
        View header = view.findViewById(R.id.header_btn_layout);
        ToolbarUtils toolbar = new ToolbarUtils(getActivity(), header);
        toolbar.initTitle("我的");
        toolbar.initHeaderDivider(false);
        toolbar.initMenuClick(R.mipmap.ic_discover_in_active, "", null, ToolbarUtils.NO_ICON, "", null);
    }


    private void initTab() {
        ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();
        String[] mTitles = {"消息", "活动"};
        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity(mTitles[i], 0, 0));
        }

        mCommonTabLayout.setTabData(mTabEntities);
        mCommonTabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                goToFragment(position);
            }

            @Override
            public void onTabReselect(int position) {
                goToFragment(position);
            }
        });
    }

    private void goToFragment(int position) {
        switch (position) {
            case TopTabUtils.MESSAGE_TAB:
                switchMessage();
                break;
            case TopTabUtils.CENTER_ACTION_TAB:
                switchCenterAction();
                break;
        }
        sp.putInt(SharedFileUtils.TOP_CURRENT_FRAGMENT_TAB, position);
        mCommonTabLayout.setCurrentTab(position);
    }

    private void switchMessage() {
        Fragment fragment = mFragmentManager.findFragmentByTag(MessageFragment.TAG);
        if (fragment == null) {
            fragment = MessageFragment.newInstance();
        }
        switchContent(mFragment, fragment, MessageFragment.TAG);

    }

    private void switchCenterAction() {
        Fragment fragment = mFragmentManager.findFragmentByTag(CenterActionFragment.TAG);
        if (fragment == null) {
            fragment = CenterActionFragment.newInstance();
        }
        switchContent(mFragment, fragment, CenterActionFragment.TAG);
    }

    //切换Fragment
    private Fragment mFragment;

    public void switchContent(Fragment from, Fragment to, String tag) {
        if (mFragment != to) {
            mFragment = to;
            FragmentTransaction transaction = mFragmentManager.beginTransaction();
            if (from != null && from.isAdded()) {
                //隐藏当前的fragment
                transaction.hide(from);
            }
            if (!to.isAdded()) {// 先判断是否被add过
                //add下一个到Activity中
                transaction.add(R.id.frameLayout, to, tag);
                transaction.commit();
            } else {
                //显示到Activity中并回复状态
                transaction.show(to).commitAllowingStateLoss();
            }
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
