package com.example.mvpframe.api;

import com.example.librx.rx.BaseResult;
import com.example.mvpframe.bean.NewsInfo;
import com.example.mvpframe.bean.WeatherInfo;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author 李栋杰
 * @time 2017/7/29  10:49
 * @desc 接口
 */
public interface ApiService {
    //http://c.m.163.com/nc/article/headline/T1348647909107/0-20.html
    @GET("article/headline/T1348647909107/{startPager}-{endPager}.html")
    Flowable<NewsInfo> getNews(@Path("startPager") String startPager,
                                           @Path("endPager") String endPager);

    //http://aider.meizu.com/app/weather/listWeather?cityIds=101240101
    @GET("listWeather")
    Flowable<BaseResult<List<WeatherInfo>>> getWeather(@Query("cityIds") String cityIds);
}
