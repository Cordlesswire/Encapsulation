/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.delaroystudios;

import com.delaroystudios.position.Admin;
import com.delaroystudios.position.Employee;
import com.delaroystudios.position.Manager;
import com.delaroystudios.position.Engineer;
import com.delaroystudios.position.Director;
import com.delaroystudios.stock.EmployeeStockPlan;

/**
 *
 * @author Shade
 */
public class EmployeeTest {
    
    public static void main(String arg[]){
        
       //Create the Classes as per the practice
       Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
       
       Manager mgr = new Manager(207, "Babara Johnson", "054-34-5678", 109_345.27, "US Marketing");
       
       Admin adm = new Admin(145, "Peters Smith", "456-34-5678", 200_345.27);
       
       Director dir = new Director(12, "Susaan Young", "34-34-5678", 200_345.27, "Global Marketing", 100_000.00);
       
       //Test the EmplyeeStockPlan class
       EmployeeStockPlan esp = new EmployeeStockPlan();
       printEmployee(eng, esp);
       printEmployee(adm, esp);
       printEmployee(mgr, esp);
       printEmployee(dir, esp);
        
    }
    
    public static void printEmployee(Employee emp){
        System.out.println(); //Print a blank line as seperator
        
        System.out.println("Employee type: " + emp.getClass().getSimpleName());
        System.out.println(emp);
       
    }
    
    public static void printEmployee(Employee emp, EmployeeStockPlan esp){
        printEmployee(emp);
        System.out.println("Stock Options: " + esp.grantStock(emp));
    }
    
}
