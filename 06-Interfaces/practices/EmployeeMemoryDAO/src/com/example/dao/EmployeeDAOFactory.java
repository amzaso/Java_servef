/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.dao.EmployeeDAOMemoryImpl;

/**
 *
 * @author amzaso
 */
public class EmployeeDAOFactory {
    
    public EmployeeDAO createEmployeeDAO(){
        
        return new EmployeeDAOMemoryImpl();
        
    }
    
}
