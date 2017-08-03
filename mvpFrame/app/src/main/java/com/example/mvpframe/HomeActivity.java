package com.example.mvpframe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.libutil.SharedFileUtils;
import com.example.mvpframe.fragment.DiscoverFragment;
import com.example.mvpframe.fragment.HomePageFragment;
import com.example.mvpframe.fragment.PersonCenterFragment;
import com.example.mvpframe.util.BottomTabUtils;
import com.example.mvpframe.util.TabEntity;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {

    @Bind(R.id.bottom_navigation_bar)
    CommonTabLayout mBottomNavigationBar;

    private static FragmentManager mFragmentManager;

    private SharedFileUtils sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        initBottomNavigationBar();
        sp = new SharedFileUtils(this);
        mFragmentManager = getSupportFragmentManager();
        goToFragment(sp.getInt(SharedFileUtils.BOTTOM_CURRENT_FRAGMENT_TAB));

    }

    protected void initBottomNavigationBar() {

        ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();

        String[] mTitles = {"首页", "发现", "我的"};
        int[] mIconUnselectIds = {
                R.mipmap.ic_head_page_in_active, R.mipmap.ic_discover_in_active,
                R.mipmap.ic_person_center_in_active};
        int[] mIconSelectIds = {
                R.mipmap.ic_head_page, R.mipmap.ic_discover,
                R.mipmap.ic_person_center};

        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i]));
        }
        mBottomNavigationBar.setTabData(mTabEntities);
        mBottomNavigationBar.setOnTabSelectListener(new OnTabSelectListener() {
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

    public void goToFragment(int position) {
        switch (position) {
            case BottomTabUtils.HOME_PAGE_TAB:
                switchHome();
                break;
            case BottomTabUtils.DISCOVER_TAB:
                switchDiscover();
                break;
            case BottomTabUtils.PERSON_CENTER_TAB:
                switchPerson();
                break;
        }
        sp.putInt(SharedFileUtils.BOTTOM_CURRENT_FRAGMENT_TAB,position);
        mBottomNavigationBar.setCurrentTab(position);
    }

    public void switchHome(){
        Fragment fragment = mFragmentManager.findFragmentByTag(HomePageFragment.TAG);
        if (fragment==null){
            fragment = HomePageFragment.newInstance();
        }
        switchContent(mFragment,fragment,HomePageFragment.TAG);
    }

    public void switchDiscover(){
        Fragment fragment = mFragmentManager.findFragmentByTag(DiscoverFragment.TAG);
        if (fragment==null){
            fragment = DiscoverFragment.newInstance();
        }
        switchContent(mFragment,fragment,DiscoverFragment.TAG);
    }

    public void switchPerson(){
        Fragment fragment = mFragmentManager.findFragmentByTag(PersonCenterFragment.TAG);
        if (fragment==null){
            fragment = PersonCenterFragment.newInstance();
        }
        switchContent(mFragment,fragment, PersonCenterFragment.TAG);
    }


    //切换Fragment
    private Fragment mFragment;
    public void switchContent(Fragment from, Fragment to,String tag) {
        if (mFragment != to) {
            mFragment = to;
            FragmentTransaction transaction = mFragmentManager.beginTransaction();
            if (from != null && from.isAdded()) {
                //隐藏当前的fragment
                transaction.hide(from);
            }
            if (!to.isAdded()) {// 先判断是否被add过
                //add下一个到Activity中
                transaction.add(R.id.frameLayout, to,tag);
                transaction.commit();
            } else {
                //显示到Activity中并回复状态
                transaction.show(to).commitAllowingStateLoss();
            }
        }
    }

    @Override
    protected void onStop() {
//        hideAllFragment();
        super.onStop();
    }

    //隐藏所有fragment
    private void hideAllFragment() {
        String[] tags = new String[]{HomePageFragment.TAG,DiscoverFragment.TAG,PersonCenterFragment.TAG};
        Fragment fragment = null;
        for (String tag : tags) {
            fragment = mFragmentManager.findFragmentByTag(tag);
            if (fragment!=null){
                FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                fragmentTransaction.hide(fragment);
            }
        }
    }
}
