package com.jee47.spring.core;

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
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext ("classpath:ExampleBean.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
