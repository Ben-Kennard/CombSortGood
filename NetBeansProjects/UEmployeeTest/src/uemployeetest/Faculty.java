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
//Defines the Faculty and their department
public class Faculty extends UEmployee{
    public String department;
    Faculty(String eName, double eSalary, String eDepartment){
    super(eName,eSalary);
    department = eDepartment;
}
    public String getDepartment(){
    return department;
}
}