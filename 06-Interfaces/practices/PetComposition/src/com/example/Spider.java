package com.example;

public class Spider extends Animal {
    
    Ambulatory ambulatory;
    
    public Spider() {
         ambulatory = new AmbulatoryImp(8);
    }

    public void walk() {
        ambulatory.walk();
    }
    
    

    @Override
    public void eat() {
        System.out.println("The spider eats a fly.");
    }
    
}