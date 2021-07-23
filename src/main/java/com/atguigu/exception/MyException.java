package com.atguigu.exception;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName ssm-annotation
 * @Author Songleen
 * @Date 2021/04/18/20:22
 */
@Data
public class MyException extends RuntimeException {

    private String status;
    private String error;
    private String message;
    private Date currentTime;

    public MyException(String status, String error, String message, Date currentTime) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.currentTime = currentTime;
    }
}
