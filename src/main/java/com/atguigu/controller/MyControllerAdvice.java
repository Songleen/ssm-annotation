package com.atguigu.controller;

import com.atguigu.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ssm-annotation
 * @Author Songleen
 * @Date 2021/04/18/20:20
 */
@ControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map<String, Object> errorHandler(Exception ex) {
        Map<String, Object> errorMap = new HashMap<>();
        errorMap.put("code", -1);
        errorMap.put("message", ex.getMessage());
        return errorMap;
    }

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public Map<String, Object> errorHandler2(MyException ex) {
        Map<String, Object> map = new HashMap<>();
        map.put("status", ex.getStatus());
        map.put("date", ex.getStatus());
        map.put("error", ex.getError());
        return map;
    }
}
