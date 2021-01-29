/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pClases.AllSort;

import java.util.ArrayList;

/**
 *
 * @author sidmox
 */
public class cBubbleSort {

    public cBubbleSort() {
    }
    
    public void bubbleSort(ArrayList<Integer> arr) 
    {
        int n=arr.size();
        int i, j, temp; 
        boolean swapped; 
        for (i = 0; i < n - 1; i++)  
        { 
            swapped = false; 
            for (j = 0; j < n - i - 1; j++)  
            { 
                if (arr.get(j) > arr.get(j + 1))  
                { 
                    temp = arr.get(j); 
                    arr.set(j, arr.get(j + 1)); 
                    arr.set(j + 1, temp); 
                    swapped = true; 
                } 
            } 
            // IF no two elements were  
            // swapped by inner loop, then break 
            if (swapped == false) 
                break; 
        } 
    }
}
