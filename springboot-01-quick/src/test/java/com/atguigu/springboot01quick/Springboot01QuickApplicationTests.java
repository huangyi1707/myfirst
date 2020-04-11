package com.atguigu.springboot01quick;

import com.atguigu.springboot01quick.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class Springboot01QuickApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    void contextLoads() {

        System.out.println(person);
    }

    /**
     * 测试HelloService组件是否添加成功
     */
    @Test
    public void testHelloService()
    {
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }
}
