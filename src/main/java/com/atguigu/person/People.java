package com.atguigu.person;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName ssm-annotation
 * @Author Songleen
 * @Date 2021/04/29/21:47
 */
@Data
@Component
public class People {
    @Value("songleen")
    private String name;
    @Value("25")
    private Integer age;



    @PostConstruct
    public void postPrint(){
        System.out.println("这是用注解的方法");
    }

    public void init(){
        System.out.println("这是吃啊花覅eolj");
    }

    public void sayBye(){
        System.out.println("这是毁灭之前执行的方法");
    }
}
