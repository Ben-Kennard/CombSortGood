/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *Tests the UEmployee class.
 */

package uemployeetest;

/**
 *
 * @author domcp9815
 */
public class UEmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Faculty soap = new Faculty("Soap",40000.0,"Math");
        Staff bob = new Staff("Bob",20000.0,"Janitor");

        System.out.println(soap.getName()+" has a salary of: $"+soap.getSalary()+" and works in the "+soap.getDepartment()+" department");
        System.out.println(bob.getName()+" has a salary of: $"+bob.getSalary()+" and works as a "+bob.getJobTitle());
    }
    
}
