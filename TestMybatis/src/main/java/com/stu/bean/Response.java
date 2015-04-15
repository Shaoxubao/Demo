package com.stu.bean;

/**
 * 返回给前端的json bean
 * 
 * @author ccj
 * @since 2014年10月21日
 */
public class Response<T> {

    private Integer retCode;
    private String msg;
    // json 数据体
    private T data;

    public Integer getRetCode() {
        return retCode;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
