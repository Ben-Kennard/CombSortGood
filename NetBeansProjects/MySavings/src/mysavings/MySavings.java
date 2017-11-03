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
import java.util.Scanner;

public class MySavings {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        Scanner bubble = new Scanner(System.in);
        PiggyBank myBank = new PiggyBank();
        System.out.println(" 1.Show savings in piggy bank. \n 2.Add a penny to the piggy bank. \n 3. Add a nickel to the piggy bank. \n 4.Add a dime to the piggy bank. \n 5.Add a quarter to the piggy bank. \n 6.Remove a penny from the piggy bank. \n 7.Remove a nickel from the piggy bank. \n 8.Remove a dime from the piggy bank. \n 9.Remove a quarter from the piggy bank. \n Enter 0 to quit the program.");
        int input;
        double totalSavings = 0;
        boolean run = true;
        /**
         * Keeps the program running until the user inputs 0
         * Then checks what the user input and then adds or removes that monetary value
         * If the user inputs a number that isn't between 0-9 it gives them an error.
         */
        while(run = true){
            input = bubble.nextInt();
        if(input == 0){
            run = false;
        }else if(input == 1){
            myBank.Print();
        }else if(input == 2){
            myBank.AddPenny();
        }else if(input == 3){
            myBank.AddNickel();
        }else if(input == 4){
            myBank.AddDime();
        }else if(input == 5){
            myBank.AddQuarter();
        }else if(input == 6){
            myBank.RemovePenny();
        }else if(input == 7){
            myBank.RemoveNickel();
        }else if(input == 8){
            myBank.RemoveDime();
        }else if(input == 9){
            myBank.RemoveQuarter();
        }else{
            System.out.println("Please input a number between 0-9");
        }
        
      }
    }

}
