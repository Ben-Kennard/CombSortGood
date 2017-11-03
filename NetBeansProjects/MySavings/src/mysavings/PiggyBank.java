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
    private double numPenny,numNickel,numDime,numQuarter;

    /**
     * Add all the methods to add and remove money from the piggy bank
     */
    PiggyBank() {

    }
/**
 * All the methods to keep track of the value in the account 
 */
    public double AddPenny() {
        numPenny++;
        return 0;
    }

    public double AddNickel() {
       numNickel++;
       return 0;
    }

    public double AddDime() {
       numDime++;
        return 0;
    }

    public double AddQuarter() {
        numQuarter++;
        return 0;
    }

    public double RemovePenny() {
        if(numPenny>0){ 
        numPenny--;
        }
        return 0;
    }

    public double RemoveNickel() {
         if(numNickel>0){ 
        numNickel--;
        }
        return 0;
    }

    public double RemoveDime() {
        if(numDime>0){ 
        numDime--;
        }
        return 0;
    }

    public double RemoveQuarter() {
     if(numQuarter>0){ 
        numQuarter--;
        }
        return 0;
    }
    /**
     * Prints out the total in the users account 
     */
    public String Print(){ 
       System.out.println("Your total is: $ "+((numPenny/100)+(numNickel/20)+(numDime/10)+(numQuarter/4)));
       return "";
    }

}
