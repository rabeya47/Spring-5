/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Ali
 */
@Component
public class WaltonImp implements PProvider{

    @Override
    public List<String> getProducts() {
        return Arrays.asList("Fridge ,","TV ,","Washing Machian ,","Laptop ");
    }
    
}
