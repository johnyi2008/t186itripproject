package com.yyaccp.beans.dto;

public class Result <T>{
    private Boolean success;
    private String msg;
    private T data;
    public static Result returnSuccess() {
        Result r = new Result();
        r.success=true;
        return r;
    }
    public static Result returnSuccess(String msg) {
        Result r = new Result();
        r.success=true;
        r.msg = msg;
        return r;
    }
    public static Result returnSuccess(String msg, Object data) {
        Result r = new Result();
        r.success=true;
        r.msg = msg;
        r.data = data;
        return r;
    }
    public static Result returnFailed() {
        Result r = new Result();
        r.success=false;
        return r;
    }
    public static Result returnFailed(String msg) {
        Result r = new Result();
        r.success=false;
        r.msg = msg;
        return r;
    }
    public static Result returnFailed(String msg, Object data) {
        Result r = new Result();
        r.success=false;
        r.msg = msg;
        r.data = data;
        return r;
    }
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
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
