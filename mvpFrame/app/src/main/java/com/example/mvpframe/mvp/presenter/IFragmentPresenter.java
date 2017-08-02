package com.example.mvpframe.mvp.presenter;

import android.content.Context;

import com.example.librx.mvp.contract.IBaseActivityContract;
import com.example.librx.mvp.presenter.IBasePresenterImpl;
import com.example.librx.rx.http.ApiException;
import com.example.librx.rx.interfaces.OnModelCallBack;
import com.example.libutil.ToastUtils;
import com.example.mvpframe.bean.WeatherInfo;
import com.example.mvpframe.mvp.contract.IFragmentContract;
import com.example.mvpframe.mvp.model.IFragmentModel;

import java.util.List;

/**
 * @author 李栋杰
 * @time 2017/8/2  10:43
 * @desc ${TODD}
 */
public class IFragmentPresenter<T extends IFragmentContract.View & IBaseActivityContract.View>
        extends IBasePresenterImpl<T> implements IFragmentContract.Presenter {

    private IFragmentModel mModel;
    private Context mContext;

    public IFragmentPresenter(Context context) {
        super(context);
        mModel = new IFragmentModel(context);
        mContext =context;
    }

    @Override
    public void getWeather() {
        String cityId = getView().getCityId();
        if (cityId.isEmpty()){
            ToastUtils.show(mContext,"输入为空");
            return;
        }
        addSubscription(mModel.getWeather(cityId, new OnModelCallBack<List<WeatherInfo>>() {
            @Override
            public void onStart() {
                getView().showLoading();
            }

            @Override
            public void onCancel() {
                getView().dismissLoading();
            }

            @Override
            public void onSuccess(List<WeatherInfo> value) {
                getView().dismissLoading();
                getView().showWeather(value.toString());
            }

            @Override
            public void onError(ApiException e) {
                getView().dismissLoading();
                getView().handleException(e);
            }

            @Override
            public void onComplete() {
                getView().dismissLoading();
            }
        }));
    }
}
