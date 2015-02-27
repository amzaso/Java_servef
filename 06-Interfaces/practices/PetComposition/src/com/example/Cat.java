package com.example;

public class Cat extends Animal implements Pet {
    
    private Nameable nameable = new NameableImpl();
    private Ambulatory ambulatory;
    
    public Cat() {
        this("Fluffy");
    }
    
    public Cat(String name) {
        ambulatory = new AmbulatoryImp(4);
        this.setName(name);
    }

    public void walk() {
        ambulatory.walk();
    }

    
    @Override
    public void setName(String name) {
        nameable.setName(name);
    }

    @Override
    public String getName() {
        return nameable.getName();
    }
    
    

    @Override
    public void eat() {
        System.out.println("Cats like to eat spiders and fish.");
    }

    @Override
    public void play() {
        System.out.println(this.getName() + " likes to play with string.");
    }
    
}