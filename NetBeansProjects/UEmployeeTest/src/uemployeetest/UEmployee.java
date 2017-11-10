/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uemployeetest;

/**
 *
 * @author domcp9815
 */
public abstract class UEmployee {
    private String name;
    private double salary;
    UEmployee(String eName, double eSalary){
        name = eName;
        salary = eSalary;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    
}
