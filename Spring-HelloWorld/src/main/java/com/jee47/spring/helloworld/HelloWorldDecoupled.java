/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jee47.spring.helloworld;

/**
 *
 * @author Ali
 */
public class HelloWorldDecoupled {
   public static void main(String... args){
       MessageRenderer mr = new StandardOutMessageRenderer();
       MessageProvider mp = new HelloWorldMessageProvider();
       mr.setMessageProvider(mp);
       mr.render();
   } 
}
