/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.delaroystudios.position;

import com.delaroystudios.position.Employee;

/**
 *
 * @author Shade
 */
public class Manager extends Employee {
    
    private String deptName;
    
    public Manager(int empId, String name, String ssn, double salary, String deptName){
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }
    
    public String getDeptName(){
        return deptName;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nDepartment: " + getDeptName();
    }
}
