package org.lisy.spring.person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("static/applicationContext.xml");
        Object contextBean = context.getBean("p1");
        System.out.println(contextBean.toString());


    }
}
