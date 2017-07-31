package com.example.mvpframe.mvp.presenter;

import android.content.Context;

import com.example.librx.mvp.contract.IBaseActivityContract;
import com.example.librx.mvp.presenter.IBasePresenterImpl;
import com.example.librx.rx.http.ApiException;
import com.example.librx.rx.interfaces.OnModelCallBack;
import com.example.librx.ui.ToastUitls;
import com.example.mvpframe.bean.NewsInfo;
import com.example.mvpframe.mvp.contract.IHomeContract;
import com.example.mvpframe.mvp.model.IHomeModel;

/**
 * @author 李栋杰
 * @time 2017/7/29  15:17
 * @desc ${TODD}
 */
public class IHomePresenter<T extends IHomeContract.View & IBaseActivityContract.View>
        extends IBasePresenterImpl<T> implements IHomeContract.Presenter {

    private IHomeModel mModel;
    private Context mContext;

    public IHomePresenter(Context context) {
        super(context);
        mModel = new IHomeModel(context);
        mContext =context;
    }

    @Override
    public void getNews() {
        String startPage = getView().getStartPage();
        String endPage = getView().getEndPage();
        if (startPage.isEmpty() || endPage.isEmpty()){
            ToastUitls.show(mContext,"输入为空");
            return;
        }
        addSubscription(mModel.getNews(startPage, endPage, new OnModelCallBack<NewsInfo>() {
            @Override
            public void onStart() {
                getView().showLoading();
            }

            @Override
            public void onCancel() {
                getView().dismissLoading();
            }

            @Override
            public void onSuccess(NewsInfo value) {
                getView().dismissLoading();
                getView().showNews(value.toString());
            }

            @Override
            public void onError(ApiException e) {
                getView().dismissLoading();
            }

            @Override
            public void onComplete() {
                getView().dismissLoading();
            }
        }));

    }
}
