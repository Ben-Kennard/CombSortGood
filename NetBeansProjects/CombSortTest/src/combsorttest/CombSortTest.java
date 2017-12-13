/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package combsorttest;

/**
 *
 * @author beken8519
 */
import java.util.*;
import java.util.Scanner;
import static java.lang.System.currentTimeMillis;
public class CombSortTest {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        double begin =0;
        double end = 0;
        double total =0;
        CombSort comb = new CombSort();
        Scanner input = new Scanner(System.in);
        System.out.println("Input the size of the array you want to sort");
        int[] elements = new int[input.nextInt()];
        input.close();
        for(int i = 0; i<elements.length;i++){
            Random rand = new Random();
            int random;
                   random = rand.nextInt(elements.length)+1;
            
            elements[i] = random;
            }
        begin = currentTimeMillis();
        comb.sort(elements);
        end = currentTimeMillis();
        total = end- begin;
        for (int i=0; i<elements.length; ++i)
            System.out.print(elements[i] + " "+"\n");
        System.out.println(comb);
        System.out.println("the total time was "+ total + "ms");
    }
    }
    
    

    

