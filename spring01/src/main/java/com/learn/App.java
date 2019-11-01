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
//        ����Spring�����ļ�
        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ��ȡbean����
        ArrayIocTest test = (ArrayIocTest) factory.getBean("arrayIocTest");
//        ����bean���󷽷�
        test.testData();
        System.out.println(test.getList());
    }
}
