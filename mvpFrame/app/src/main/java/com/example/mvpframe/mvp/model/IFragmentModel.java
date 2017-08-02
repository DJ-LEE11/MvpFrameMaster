package com.example.mvpframe.mvp.model;

import android.content.Context;

import com.example.librx.mvp.model.IBaseModelImpl;
import com.example.librx.rx.http.ApiServiceFactory;
import com.example.librx.rx.http.CustomResourceSubscriber;
import com.example.librx.rx.http.HttpResultFunc;
import com.example.librx.rx.http.ServerResultFunc;
import com.example.librx.rx.interfaces.OnModelCallBack;
import com.example.mvpframe.BuildConfig;
import com.example.mvpframe.api.ApiService;
import com.example.mvpframe.bean.WeatherInfo;
import com.example.mvpframe.mvp.contract.IFragmentContract;

import java.util.List;

import io.reactivex.subscribers.ResourceSubscriber;

/**
 * @author 李栋杰
 * @time 2017/8/2  10:47
 * @desc ${TODD}
 */
public class IFragmentModel extends IBaseModelImpl implements IFragmentContract.Model {
    public IFragmentModel(Context context) {
        super(context);
    }

    @Override
    public ResourceSubscriber getWeather(String cityId, OnModelCallBack<List<WeatherInfo>> callBack) {
        return startObservable(ApiServiceFactory.INSTANCE
                .create(mContext, BuildConfig.API_WEATHER_URL, ApiService.class)
                .getWeather(cityId)
                .map(new ServerResultFunc<List<WeatherInfo>>())
                .onErrorResumeNext(new HttpResultFunc<List<WeatherInfo>>()), new CustomResourceSubscriber<List<WeatherInfo>>(callBack));
    }
}