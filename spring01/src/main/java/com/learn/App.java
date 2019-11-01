package com.learn;

import com.learn.ioc.ArrayIocTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
//        加载Spring配置文件
        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
//        获取bean对象
        ArrayIocTest test = (ArrayIocTest) factory.getBean("arrayIocTest");
//        调用bean对象方法
        test.testData();
        System.out.println(test.getList());
    }
}
