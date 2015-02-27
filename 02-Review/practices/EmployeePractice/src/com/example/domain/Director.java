/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

/**
 *
 * @author javat
 */
public class Director extends Manager{
    
    private double budget;
    
    public Director (int employeId, String name, String sSN, double salary, String deptName,double budget){
    
            super (employeId,name, sSN, salary, deptName);
            this.budget = budget;
     }

    @Override
    public String toString() {
        return super.toString() + "\npresupuesto: "+this.budget;
    }
    
    

    /**
     * @return the budget
     */
    public double getBudget() {
        return budget;
    }

    /**
     * @param budget the budget to set
     */
    public void setBudget(double budget) {
        this.budget = budget;
    }
    
    
    
}
