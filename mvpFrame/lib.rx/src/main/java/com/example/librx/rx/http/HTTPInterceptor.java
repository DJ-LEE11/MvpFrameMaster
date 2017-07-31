package com.example.librx.rx.http;

import android.text.TextUtils;

import com.example.librx.ui.LogUtils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author 李栋杰
 * @time 2017/7/29  10:17
 * @desc 定义http拦截器，用于设置http协议和日志调试
 */
public class HTTPInterceptor implements Interceptor {
    public static final String TOKEN = "HTTP.TOKEN";
    private static String TAG = "HTTP-Interceptor";

    public static String getToken() {
        return token;
    }

    public static void setToken(String token) {
        synchronized (token) {
            HTTPInterceptor.token = token;
        }
    }

    private static String token;

    public HTTPInterceptor() {
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder header = request.newBuilder()
                .header("platform", "Android");
        LogUtils.e("token===>"+token);
        if (!TextUtils.isEmpty(token)) {
            header.header("token", token);
        }
        Request authorised = header.build();
        return chain.proceed(authorised);
    }
}
