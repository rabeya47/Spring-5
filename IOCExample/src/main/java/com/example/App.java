package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("classpath:context_bean.xml");
        PService p = con.getBean(PService.class);
        p.print();
    }
}
 