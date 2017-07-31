package com.example.librx.rx.http;

import com.example.librx.rx.BaseResult;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.functions.Function;

/**
 * @author 李栋杰
 * @time 2017/7/29  10:24
 * @desc ${TODD}
 */
public class ServerResultFunc <T> implements Function<BaseResult<T>, T> {

    //将不是对应的code抛出ServerException处理
    @Override
    public T apply(BaseResult<T> baseResult) throws Exception {
        List<String> codes = getStayCode();
        //通过请求码判断是否请求成功
        if (codes.contains(baseResult.code)) {

            return baseResult.data;
        }
        throw new ServerException(baseResult);
    }

    //将需要的保留的信息留在onNext中
    public List<String> getStayCode() {
        List<String> list = new ArrayList<>();
        //请求成功返回码
        list.add("0000");
        return list;
    }
}
