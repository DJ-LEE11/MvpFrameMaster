package com.example.librx.rx.http;

import com.example.librx.rx.BaseResult;

/**
 * @author 李栋杰
 * @time 2017/7/29  10:24
 * @desc ${TODD}
 */
public class ServerException extends Exception {
    private String code;
    private String msg;
    Object data;

    public ServerException(String code, String msg) {
        this(code, msg, null);
    }

    public ServerException(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ServerException(BaseResult baseResult) {
        this.code = baseResult.code;
        this.msg = baseResult.msg;
        this.data = baseResult.data;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
