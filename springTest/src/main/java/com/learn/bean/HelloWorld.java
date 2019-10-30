package com.learn.bean;

public class HelloWorld {
    private String userName;

    public void setUserName(String name) {
        this.userName = name;
    }
    public void print(){
        System.out.println("hello"+"  "+this.userName);
    }
}