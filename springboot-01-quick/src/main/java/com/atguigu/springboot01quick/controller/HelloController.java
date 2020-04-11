package com.atguigu.springboot01quick.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*@ResponseBody 如果放在这表示该类每个方法都是写给浏览器*/
/*@Controller*/
@RestController/*这是代替@ResponseBody和@Controller的功能*/
public class HelloController {

    /*@ResponseBody*/
    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick";
    }
}
