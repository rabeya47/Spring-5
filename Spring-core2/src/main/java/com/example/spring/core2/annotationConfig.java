/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring.core2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Ali
 */
@Configuration
public class annotationConfig {
    
    @Bean
    @Qualifier("student")
    public StudentModel student(){
    return new StudentModel();
    }
    
    @Bean
    @Qualifier("student1")
    public StudentModel student1(){
      StudentModel st1 = new StudentModel();
      st1.setId(001);
      st1.setName("Amina");
      st1.setContact(01435456476);
      return st1;
    }
    
}
