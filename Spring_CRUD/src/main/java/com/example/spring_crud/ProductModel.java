/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring_crud;

/**
 *
 * @author Ali
 */
public class ProductModel {
    private int id;
    private String name;
    private int quantity;
    private double price;
    private String remarks;

    public ProductModel() {
    }

    public ProductModel(int id, String name, int quantity, double price, String remarks) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.remarks = remarks;
    }

    public ProductModel(String name, int quantity, double price, String remarks) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.remarks = remarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "ProductModel{" + "id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", remarks=" + remarks + '}';
    }
    
    
}
