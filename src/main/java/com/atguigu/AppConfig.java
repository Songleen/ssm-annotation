package com.atguigu;

import com.atguigu.person.People;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @ClassName ssm-annotation
 * @Author Songleen
 * @Date 2020/05/28/20:29
 */
@Configuration
@ComponentScan("com.atguigu")
@EnableWebMvc
// @EnableAspectJAutoProxy
// @EnableTransactionManagement
public class AppConfig {


    /*@Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/",".jsp");
    }*/

    // @Bean(initMethod = "init",destroyMethod = "sayBye")
    public People getPeople(){
        return new People();
    }

}
