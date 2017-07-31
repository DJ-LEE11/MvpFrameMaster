package com.example.librx.rx;

import com.example.librx.rx.interfaces.IServerException;

/**
 * @author 李栋杰
 * @time 2017/7/29  10:06
 * @desc 接口基本返回实体
 */
public class BaseResult <T> implements IServerException {
    public String msg;// 提示信息
    public boolean status;// 状态
    public String code;// 错误代码
    public T data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

}