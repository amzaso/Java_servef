/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.business;

import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Manager;

/**
 *
 * @author javat
 */
public class EmployeeStockPlan {
    
    private final int empleadoOptions = 10;
    private final int managerOptions = 100;
    private final int directorOptions = 1000;
    
    public int grantStock(Employee e)
    {
        
        if(e instanceof Director){
            
            return directorOptions;
        }
        else if(e instanceof Manager){
            
            return managerOptions;
        }
        else return empleadoOptions;

    }
    
}
