package com.example.mvpframe.mvp.contract;

import com.example.librx.rx.interfaces.OnModelCallBack;
import com.example.mvpframe.bean.WeatherInfo;

import java.util.List;

import io.reactivex.subscribers.ResourceSubscriber;

/**
 * @author 李栋杰
 * @time 2017/8/2  10:46
 * @desc ${TODD}
 */
public interface IFragmentContract {
    interface View {
        //获取城市Id
        String getCityId();

        //显示新闻
        void showWeather(String weatherInfo);
    }

    interface Presenter {
        void getWeather();
    }

    interface Model {
        //获取新闻信息
        ResourceSubscriber getWeather(String cityId, OnModelCallBack<List<WeatherInfo>> callBack);
    }
}
