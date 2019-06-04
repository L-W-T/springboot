package com.lwt.springboot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class ResponseResult {

    private ResponseResult() {

    }

    private ResponseResult(String code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    /**
     * 成功返回 0：成功， 1：失败
     *
     * @param data
     * @return
     */
    public static ResponseResult success() {
        return success(null);
    }

    /**
     * 成功返回 0：成功， 1：失败
     *
     * @param data
     * @return
     */
    public static ResponseResult success(Object data) {
        return getResult("0", "success", data);
    }

    /**
     * 失败返回
     *
     * @param msg 提示信息
     * @return
     */
    public static ResponseResult failed(String msg) {
        return failed("1", msg);
    }

    /**
     * 失败返回
     *
     * @param msg 提示信息
     * @return
     */
    public static ResponseResult failed(String code, String msg) {
        return getResult(code, msg, null);
    }

    private static ResponseResult getResult(String code, String msg, Object data) {
        ResponseResult result = new ResponseResult(code, msg);
        result.setData(data);
        return result;
    }

    private String code;
    private String msg;
    private Object data;

}
