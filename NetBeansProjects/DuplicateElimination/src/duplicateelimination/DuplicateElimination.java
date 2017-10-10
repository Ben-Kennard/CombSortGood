/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicateelimination;

import java.security.SecureRandom;
import java.util.Arrays;

public class DuplicateElimination {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecureRandom num1 = new SecureRandom();
        int[] array = new int[5];
        for (int i = 0; i < 5; i++){ 
            array[i] = num1.nextInt(91) + 10;
            for(int j = 0; j < i; j++){
                if(array[i] == array[j]){
                    array[i] = 0;
                }
            }
        }
        System.out.print("The numbers generated are: ");
        for(int k = 0; k < 5; k++){
            if(array[k] == 0){
                System.out.print("");
            }else{
                System.out.print(array[k]+",");
                
            }
        }
    }

}
