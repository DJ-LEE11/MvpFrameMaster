package com.example.librx.rx.http;

import com.example.librx.rx.BaseResult;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.functions.Function;

/**
 * @author 李栋杰
 * @time 2017/7/29  10:25
 * @desc 用于处理操作成功（data为空，又需要提示的情况）的情况
 */
public class ServerResultWithDataFunc <T extends BaseResult> implements Function<T, T> {

    //将不是对应的code抛出ServerException处理
    @Override
    public T apply(T baseResult) throws Exception {
        List<String> codes = getStayCode();
        //通过请求码判断是否请求成功
        if (codes.contains(baseResult.code)) {
            return baseResult;
        }
        throw new ServerException(baseResult);
    }

    //将需要的保留的信息留在onNext中
    public List<String> getStayCode() {
        List<String> list = new ArrayList<>();
        //请求成功返回码(该天气API的请求成功返回码是200)
        list.add("200");
        return list;
    }
}
