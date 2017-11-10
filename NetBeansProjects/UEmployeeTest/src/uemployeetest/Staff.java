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
//Defines the Staff and their job title
public class Staff extends UEmployee{
    public String jobTitle;
    Staff(String eName, double eSalary, String eJobTitle){
    super(eName,eSalary);
    jobTitle = eJobTitle;
}
    public String getJobTitle(){
    return jobTitle;
}
}