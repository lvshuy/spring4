package com.learn.ioc;

import java.util.List;

public class ArrayIocTest {
    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void testData(){
//        ±éÀú¼¯ºÏ
        for (String str : list) {
            System.out.println("list===="+str);
        }
    }
}
