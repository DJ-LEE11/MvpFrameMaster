package com.example.librx.rx;

/**
 * @author 李栋杰
 * @time 2017/8/2  17:59
 * @desc 接口基本返回实体
 */
public class BaseResult<T> {
    public String code;// 提示信息
    public String message;// 错误代码
    public String redirect;
    public T value;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T  value) {
        this.value = value;
    }
}
