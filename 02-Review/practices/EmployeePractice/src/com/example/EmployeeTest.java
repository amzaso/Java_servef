/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.business.EmployeeStockPlan;
import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Manager;
import java.text.NumberFormat;

/**
 *
 * @author javat
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Engineer e1 = new Engineer(101, "Jane Stmith", "012-34-5678", 120_345.27);
        
        Manager m1 = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, null);
        m1.setDeptName("US Marketing");
        
        Admin a1 = new Admin(304, "Bill Monroe", "108-23-6509", 75_002.34);
        
        Director d1 = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, null, 0);
        d1.setDeptName("Global Marketing");
        d1.setBudget(1_000_000.00);
        
        d1.setName("Tomas");
        a1.raiseSalary(5000.00);
        
        e1.raiseSalary(-80000.00);
        m1.setName(null);
        a1.setName("");
        
        
        EmployeeStockPlan plan = new EmployeeStockPlan();
        printEmployee(e1, plan);
        printEmployee(m1, plan);
        printEmployee(a1, plan);
        printEmployee(d1, plan);
        
        
  
    }
    
        public static void printEmployee(Employee emp) {
            
           System.out.println(emp+"\n");

        }
        
        public static void printEmployee(Employee emp, EmployeeStockPlan plan) {
            
           System.out.println("Employee type: "+emp.getClass().getSimpleName());
           System.out.println(emp);
           System.out.println("Stock Options: "+plan.grantStock(emp)+"\n");

        }
   
}
