package com.example.mvpframe.mvp.contract;

import com.example.librx.rx.interfaces.OnModelCallBack;
import com.example.mvpframe.bean.NewsInfo;

import io.reactivex.subscribers.ResourceSubscriber;

/**
 * @author 李栋杰
 * @time 2017/7/29  15:17
 * @desc ${TODD}
 */
public interface IHomeContract {

    interface View {
        //获取初始页
        String getStartPage();

        //获取结束页
        String getEndPage();

        //显示新闻
        void showNews(String newsInfo);
    }

    interface Presenter {
        void getNews();
    }

    interface Model {
        //获取新闻信息
        ResourceSubscriber getNews(String startPager, String endPager, OnModelCallBack<NewsInfo> callBack);
    }
}
