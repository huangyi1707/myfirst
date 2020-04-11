package com.atguigu.springboot01quick.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.awt.print.PrinterAbortException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/*@PropertySource(value = {"classpath:application.properties"})*/
@Component/*将此bean类加入spring的容器中才能调用*/
@ConfigurationProperties(prefix = "person")/*将配置文件中的属性值加入到该bean类中，prefix表示要映射配置文件中的哪组属性*/
public class Person {

    private String p_name;
    private Integer age;
    private Date birthday;
    private Boolean boss;
    private List<Object> list;
    private Map<String,Object> map;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "p_name='" + p_name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", boss=" + boss +
                ", list=" + list +
                ", map=" + map +
                ", dog=" + dog +
                '}';
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
