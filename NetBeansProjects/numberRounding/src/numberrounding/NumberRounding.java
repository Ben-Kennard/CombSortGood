/*
 *By D.Calvin McPhail
 *On October 2nd 2017
 *To round numbers up to 3 decimal places
 */
package numberrounding;

/**
 *
 * @author domcp9815
 */
import java.util.Scanner;

public class NumberRounding {

    /**
     * main method is used to receive the users input and then call the appropriate method. 
     *  
     */
    public static void main(String[] args) {
        double number = 0;
        System.out.println("Please select an option\n1.Round number\n2.Round number to one decimal\n3.Round number to two decimal places\n4.Round number to three decimal places");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        System.out.println("Please input the number you want to be rouded");
        number = input.nextDouble();
        //Checking what the user input was to call on what method they want to run
        if(choice == 1){
            noDecimal(number);
        }else if(choice == 2){
            oneDecimal(number);
        }else if(choice == 3){
            twoDecimal(number);
        }else{
            threeDecimal(number);
        }
    }
    /**
     * noDecimal() method is used to round the number with no decimals
     * The methods need the number that the user wants to round 
     */
    //Round number to have no decimal places noDecimal() 
    //Round number to 1 decimal place oneDecimal()
    //Round number to 2 decimal place twoDecimal()
    //Round number to 3 decimal place threeDecimal()
    public static void noDecimal(double number) {
        double rounded = number+0.5;
        int result = (int)(rounded);
        System.out.println("Your number is rounded to "+result);
    }
     /**
     * oneDecimal() method is used to round the number to one decimal place
     * The methods need the number that the user wants to round  
     */
    public static void oneDecimal(double number){
        double rounded = ((number*10)+0.5);
        int result = (int)(rounded);
        double Result = (double)result/10;
        System.out.println("Your number is rounded to "+Result);
    }
     /**
     * twoDecimal() method is used to round the number to two decimal places
     * The methods need the number that the user wants to round 
     */
    public static void twoDecimal(double number){
        double rounded = ((number*100)+0.5);
        int result = (int)(rounded);
        double Result = (double)result/100;
        System.out.println("Your number is rounded to "+Result);
    }
     /**
     * threeDecimal() method is used to round the number to three decimal places
     * The methods need the number that the user wants to round  
     */
    public static void threeDecimal(double number){
        double rounded = ((number*1000)+0.5);
        int result = (int)(rounded);
        double Result = (double)result/1000;
        System.out.println("Your number is rounded to "+Result);
    }
 
 
}
