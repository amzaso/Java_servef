/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.model.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amzaso
 */
public class EmployeeDAOMemoryImpl implements EmployeeDAO {
    
        private Employee[] employeeArray;
        
        protected EmployeeDAOMemoryImpl(){
            
            employeeArray = new Employee[10];
        }


    @Override
    public void add(Employee emp) {
           
        employeeArray[emp.getId()] = emp; 
    }

    @Override
    public void update(Employee emp) {
        this.add(emp);
    }

    @Override
    public void delete(int id) {
         
        employeeArray[id] = null;

    }

    @Override
    public Employee findById(int id) {
         return employeeArray[id];
    }

    @Override
    public Employee[] getAllEmployees() {
        List<Employee> emps = new ArrayList<>();
        // Iterate through the memory array and find Employee objects
        for (Employee e : employeeArray) {
            if (e != null) {
                emps.add(e);
            }
        }
        return emps.toArray(new Employee[0]);
    }
    
}
