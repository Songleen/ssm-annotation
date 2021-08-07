package com.atguigu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName ssm-annotation
 * @Author Songleen
 * @Date 2020/05/28/20:32
 */

@Controller
@ResponseBody
public class IndexController {


    @GetMapping("/index")
    public String index() {
        try {
            // int a = 1 / 0;
            System.out.println("zee");
            return "welcom";
        } catch (Exception e) {
            throw e;
            // throw new MyException("2002","有零","hahah",new Date());
        }

    }
}
