package com.atguigu.spring.bean;

public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println("hello"+this.name);
    }
}
