package com.example.demo.controller;

import springfox.documentation.spring.web.json.Json;

import java.util.HashMap;
import java.util.Map;

public class WebResponse {
    public static Integer REQUEST_SUCCESS_CODE = 200; //请求成功
    public static Integer REQUEST_ENPTY_CODE = 201; // 请求成功 但是数据为空
    public static Integer REQUEST_ERROR_CODE = 400; // 客户端请求异常
    public static Integer SERVER_ERROR_CODE = 500; // 服务器异常

    public Integer code;
    public String msg = "";
    public Map<String, Object> data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public WebResponse(Integer code, String msg, Map<String, Object> data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public WebResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public WebResponse(Integer code, Map<String, Object> data) {
        this.code = code;
        this.data = data;
    }

    public WebResponse() {
    }
}
