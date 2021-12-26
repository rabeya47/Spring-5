package com.example.spring.core2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        StudentModel stu = context.getBean("st", StudentModel.class);
        System.out.println(stu);
        
        
       ApplicationContext ctx = new AnnotationConfigApplicationContext(annotationConfig.class);
       StudentModel st = ctx.getBean("student", StudentModel.class);
       StudentModel st2 = ctx.getBean("student1", StudentModel.class);
        System.out.println(st2);
    }
}
