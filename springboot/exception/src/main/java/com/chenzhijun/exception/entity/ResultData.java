package com.chenzhijun.exception.entity;

import java.io.Serializable;

public class ResultData<T> implements Serializable {
    private static final long serialVersionUID = -3420235732267030819L;
    private Boolean successed = true;

    private String errorCode = "";

    private String errorMsg = "";

    private T data = null;

    private String repeatAct;//重复提交

    private String url;

    public Boolean getSuccessed() {
        return successed;
    }

    public void setSuccessed(Boolean successed) {
        this.successed = successed;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getRepeatAct() {
        return repeatAct;
    }

    public void setRepeatAct(String repeatAct) {
        this.repeatAct = repeatAct;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
