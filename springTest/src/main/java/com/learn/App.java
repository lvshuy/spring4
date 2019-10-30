package com.learn;

import com.learn.bean.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        HelloWorld hello = new HelloWorld();
//        hello.setUserName("Spring");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld hello = (HelloWorld) ctx.getBean("helloWorld");
        hello.print();
    }
}
