/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

/**
 *
 * @author javat
 */
public class Manager extends Employee {
    
    private String deptName;
    private Employee[] staff;
    private int employeeCount = 0;
    
    public Manager (int employeId, String name, String sSN, double salary, String deptName){
        super (employeId, name, sSN, salary);
        this.deptName = deptName;
        
        staff = new Employee[20];
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartament: "+this.deptName;
    }
    
    

    /**
     * @return the deptName
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName the deptName to set
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    
    public int findEmployee(Employee emp){
        
        for (int i = 0; i<staff.length;i++)
        {
            if (staff[i].equals(emp))
            {
                return i;
            }
        }
        
        return -1;
    }
    
    public boolean addEmployee (Employee emp){
        
        if (this.findEmployee(emp) == -1){
            
            staff[this.employeeCount] = emp;
            this.employeeCount++;
            return true;
        }
        
        return false;
    }
    
    public boolean removeEmployee (int idEmp){
        boolean ok = false;
        Employee[] matrizTemp = new Employee[20];
        int cont = 0;
        
        for (int i = 0; i < this.employeeCount; i++)
        {

            if (staff[cont].getEmployeId() == idEmp){
                cont++;
                ok = true;
            }
            matrizTemp[i] = this.staff[cont];
            cont++;
        }
        
        this.staff = matrizTemp;
        this.employeeCount = this.staff.length;
        
        return ok;
    }
    
    public void printStaffDetails ()
    {
        System.out.println("El Jefe: "+this.getName());
        for (int i = 0; i < this.employeeCount; i++){
            System.out.println("Empleado nº"+i+": "+this.staff[i].getName());
        }
    }
    
}
