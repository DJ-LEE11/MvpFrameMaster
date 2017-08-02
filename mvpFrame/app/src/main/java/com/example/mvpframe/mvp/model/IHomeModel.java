package com.example.mvpframe.mvp.model;

import android.content.Context;

import com.example.librx.mvp.model.IBaseModelImpl;
import com.example.librx.rx.http.ApiServiceFactory;
import com.example.librx.rx.http.CustomResourceSubscriber;
import com.example.librx.rx.http.HttpResultFunc;
import com.example.librx.rx.interfaces.OnModelCallBack;
import com.example.mvpframe.BuildConfig;
import com.example.mvpframe.api.ApiService;
import com.example.mvpframe.bean.NewsInfo;
import com.example.mvpframe.mvp.contract.IHomeContract;

import io.reactivex.subscribers.ResourceSubscriber;

/**
 * @author 李栋杰
 * @time 2017/7/29  15:17
 * @desc ${TODD}
 */
public class IHomeModel extends IBaseModelImpl implements IHomeContract.Model {
    public IHomeModel(Context context) {
        super(context);
    }


    @Override
    public ResourceSubscriber getNews(String startPager, String endPager, OnModelCallBack<NewsInfo> callBack) {
        return startObservable(ApiServiceFactory.INSTANCE
                        .create(mContext, BuildConfig.API_NEWS_URL, ApiService.class)
                        .getNews(startPager, endPager)
                        .onErrorResumeNext(new HttpResultFunc<NewsInfo>())
                , new CustomResourceSubscriber<NewsInfo>(callBack));
    }
}
