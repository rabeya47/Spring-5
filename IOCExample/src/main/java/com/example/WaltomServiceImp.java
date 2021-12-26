/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ali
 */
@Service
public class WaltomServiceImp implements PService{

    @Autowired
    private PProvider pprovider;
    
    public void print() {
        pprovider.getProducts().stream().forEach(System.out::print);
                
        
    }
    
}
