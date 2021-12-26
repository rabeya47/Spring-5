/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring.core2;

/**
 *
 * @author Ali
 */
public class StudentModel {

    private int id;
    private String name;
    private int contact;

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

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public StudentModel(int id, String name, int contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    public StudentModel() {
    }

    @Override
    public String toString() {
        return "StudentModel{" + "id=" + id + ", name=" + name + ", contact=" + contact + '}';
    }

}
