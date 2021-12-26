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
public class HelloWorldMessageProvider implements MessageProvider{

    @Override
    public String getMssage() {
        return "Good Job !";
    }
    
}
