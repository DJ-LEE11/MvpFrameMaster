package com.example.mvpframe.api;

import com.example.mvpframe.bean.NewsInfo;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;

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
}
