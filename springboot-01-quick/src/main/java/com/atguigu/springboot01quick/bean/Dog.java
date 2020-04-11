package com.atguigu.springboot01quick.bean;

public class Dog {

    private String d_name;
    private Integer age;

    @Override
    public String toString() {
        return "Dog{" +
                "d_name='" + d_name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
