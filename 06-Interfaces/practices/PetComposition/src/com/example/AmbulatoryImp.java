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
public class AmbulatoryImp implements Ambulatory {
    
    private int legs;
    
    public AmbulatoryImp(int legs)
    {
        this.legs = legs;
    }

    @Override
    public void walk() {
    
        System.out.println("This animal walks on "+ this.legs+" legs.");
    }
    
}
