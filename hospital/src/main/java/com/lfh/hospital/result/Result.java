package com.lfh.hospital.result;

import lombok.Data;

import java.io.Serializable;

/**
 * @author LFH
 * @Description:
 * @date 2021/3/4
 */
@Data
public class Result implements Serializable {
    private int code;
    private String message;
    private Object data;

    public Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
