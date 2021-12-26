/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.StringProject2;


import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ali
 */
@RestController
public class NewClass {
   @GetMapping("/") 
   public String index(HttpServletRequest req){
//       return "hello world";
       String name = req.getParameter("name");
        return "hello " +name;
   }
   
   @GetMapping("/list")
   public List<String> list(){ 
         List<String> names = new ArrayList<>();
         names.add("Mehedi Hasan");
         names.add("Amina Khatun");
         names.add("MD Khalilullah");
         names.add("Saiful Islam");
         
       return names;
   }
}
