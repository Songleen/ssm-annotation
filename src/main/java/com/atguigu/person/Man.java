package com.atguigu.person;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.Lifecycle;
import org.springframework.context.LifecycleProcessor;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * @ClassName ssm-annotation
 * @Author Songleen
 * @Date 2021/04/29/22:20
 */
@Data
@Component
public class Man implements SmartLifecycle {

    @Value("dageda")
    private String name;
    @Value("25")
    private Integer age;

    @Override
    public void start() {
        System.out.println("开始了");
    }

    @Override
    public void stop() {
        System.out.println("结束了");
    }

    @Override
    public boolean isRunning() {
        System.out.println("这在运行");
        return true;
    }


    @Override
    public boolean isAutoStartup() {
        System.out.println("auto开始了");
        return true;
    }

    @Override
    public void stop(Runnable runnable) {
        System.out.println("auto结束了");
    }

    @Override
    public int getPhase() {
        System.out.println("哈哈哈哈");
        return 0;
    }
}
