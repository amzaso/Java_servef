/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

import java.text.NumberFormat;

/**
 *
 * @author javat
 */
public class Employee {
    
    private int employeId;
    private String name;
    private String sSN;
    private double salary;
    
    public Employee(int employeId, String name, String sSN, double salary){
        
        this.employeId = employeId;
        this.name = name;
        this.sSN = sSN;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id: "+this.employeId+"\nnombre: "+this.name+"\nnSS: "+this.sSN+"\nsalario: "+NumberFormat.getCurrencyInstance().format(this.salary);
    }
    
    

    public void setName(String name) {
        
        if (name != null && !name.equals("") ){
            
            this.name = name;
        }
    }

    public void raiseSalary(double increase)
    {
        if (increase >= 0)
         this.salary += increase;
    }

    /**
     * @return the employeId
     */
    public int getEmployeId() {
        return employeId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the sSN
     */
    public String getsSN() {
        return sSN;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }
    
    
}
