/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Ali
 */
public class main {
    public static void main(String[] args) {
        ApplicationContext cont = new ClassPathXmlApplicationContext("classpath:examplebean.xml");
        Student st = cont.getBean("student" ,Student.class);
        System.out.println(st);
        
        Student ms = cont.getBean("setMassage" ,Student.class);
        System.out.println(ms);
    }
}
