/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.model.Employee;

/**
 *
 * @author amzaso
 */
public interface EmployeeDAO {
    
    public void add(Employee emp);
    public void update(Employee emp);
    public void delete(int id);
    public Employee findById(int id);
    public Employee[] getAllEmployees();
    
}
