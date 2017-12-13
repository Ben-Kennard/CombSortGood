/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combsorttest;

/**
 *
 * @author Ben
 */
public class CombSort {
    private int swaps=0,comps=0;
    public void sort(int[]array){
       
        int length = array.length;
        int gap = length;
        boolean swapped = true;
          while(gap != 1 && swapped == true){
              gap = findGap(gap);
          for(int i = 0; i<array.length-gap;i++){
              if(i == array.length-gap){
                         i = 0;
                     }
                comps++;
                if(array[i]>array[i+gap]){
                   
               
        int temp = array[i];
        array[i] = array[i+gap];
        array[i+gap] = temp;
        swaps++;
                }

          
            }   
        }
    }

    
    public String toString(){
       String output = "The number of comparisons are "+comps + "\n" + "The number of swaps are " + swaps;
        return output;
    }
    public int findGap(int gap){
         gap = (gap*10)/13;
         if(gap<1){
             return 1;
         }
         return gap;
    }
}
