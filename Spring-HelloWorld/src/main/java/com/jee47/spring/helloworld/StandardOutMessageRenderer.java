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
public class StandardOutMessageRenderer implements MessageRenderer{

        private MessageProvider messageProviders;
    
    @Override
    public void render() {
        if(messageProviders == null){
            throw new RuntimeException(
            "You must set the property messageProvider of class: "+StandardOutMessageRenderer.class.getName()
            );
        }
        System.out.println(messageProviders.getMssage());
    }
    

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProviders = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProviders;
    }
    
}
