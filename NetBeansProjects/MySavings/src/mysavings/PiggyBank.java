/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysavings;

/**
 *
 * @author domcp9815
 */
public class PiggyBank {

    private double totalSavings;
    //private double numPenny, numNickel, numDime, numQuarter;

    /**
     * Add all the methods to add and remove money from the piggy bank
     */
    PiggyBank() {

    }

    /**
     * All the methods to keep track of the value in the account
     */
    public void AddPenny() {
        totalSavings +=0.01;
    }

    public void AddNickel() {
        totalSavings +=0.05;
    }

    public void AddDime() {
        totalSavings +=0.1;
    }

    public void AddQuarter() {
        totalSavings +=0.25;
    }

    public void RemovePenny() {
        if (totalSavings >= 0.01) {
            totalSavings -=0.01;
        }
    }

    public void RemoveNickel() {
        if (totalSavings >= 0.05) {
            totalSavings -=0.05;
        }
    }

    public void RemoveDime() {
        if (totalSavings >= 0.1) {
            totalSavings -=0.1;
        }
    }

    public void RemoveQuarter() {
        if (totalSavings >= 0.25) {
            totalSavings -=0.01;
        }
    }

    /**
     * Prints out the total in the users account
     */
    public void Print() {
        System.out.println("Your total is: $ " + totalSavings);
        
    }

}
