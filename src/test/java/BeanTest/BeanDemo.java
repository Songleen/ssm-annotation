package BeanTest;

import com.atguigu.AppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName ssm-annotation
 * @Author Songleen
 * @Date 2021/04/29/21:45
 */
public class BeanDemo {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        Object people = ac.getBean("man");
        System.out.println(people.toString());

    }
}
