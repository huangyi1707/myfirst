package com.atguigu.springboot01quick.config;

import com.atguigu.springboot01quick.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration：指明当前类是一个配置类
 */
@Configuration
public class MyAppConfig {

    /**
     * 将方法的返回值添加到容器中，容器中的id就是方法名
     * @return
     */
    @Bean
    public HelloService helloService()
    {
        System.out.println("添加组件成功！");
        return new HelloService();
    }
}
