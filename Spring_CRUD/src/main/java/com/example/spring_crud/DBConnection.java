/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ali
 */
public class DBConnection {
    public static Connection conn =null;
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        if(conn == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/js47","root","123456");
            return conn;
            
        }
        return conn;
    }
 
}
