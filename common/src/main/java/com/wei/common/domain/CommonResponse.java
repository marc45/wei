package com.wei.common.domain;

import java.util.HashMap;
import java.util.Map;

public class CommonResponse<T> {

    /**
     * 业务上的成功或失败
     */
    private boolean success = true;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回数据
     */
    private Map<String, Object> data = new HashMap<>();

    /**
     * 返回泛型数据，自定义类型
     */
    private T content;

    @Override
    public String toString() {
        return "CommonResponse{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", content=" + content +
                '}';
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
