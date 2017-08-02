package com.example.mvpframe.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.librx.mvp.BaseFragment;
import com.example.mvpframe.BuildConfig;
import com.example.mvpframe.R;
import com.example.mvpframe.mvp.contract.IFragmentContract;
import com.example.mvpframe.mvp.presenter.IFragmentPresenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Riven on 2016/12/22.
 * Email: 1819485687@qq.com
 */
public class HomePageFragment extends BaseFragment implements IFragmentContract.View {

    public static final String TAG = "HomeFragment";

    private static HomePageFragment fragment;
    private IFragmentPresenter mIFragmentPresenter;

    @Bind(R.id.etCityId)
    EditText mEtCityId;
    @Bind(R.id.tvInfo)
    TextView mTvInfo;

    public static HomePageFragment newInstance() {
        if (null == fragment) {
            fragment = new HomePageFragment();
        }
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_page, container, false);
        ButterKnife.bind(this, view);
        mEtCityId.setText(BuildConfig.city_id);
        return view;
    }

    @Override
    protected List createPresenter(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        mIFragmentPresenter = new IFragmentPresenter(getActivity());
        list.add(mIFragmentPresenter);
        return list;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick(R.id.btnGetInfo)
    public void onGetInfo() {
        mIFragmentPresenter.getWeather();
    }

    @Override
    public String getCityId() {
        return mEtCityId.getText().toString();
    }

    @Override
    public void showWeather(String weatherInfo) {
        mTvInfo.setText(weatherInfo);
    }


}
