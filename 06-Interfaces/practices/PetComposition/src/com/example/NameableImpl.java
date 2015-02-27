/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author amzaso
 */
public class NameableImpl implements Nameable {
    
    private String name;

    @Override
    public void setName(String name) {
        
        if(name.length()<20)
        {
            this.name = name;
        }
        else
        {
            System.out.println("Name too long.");
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
    
}
