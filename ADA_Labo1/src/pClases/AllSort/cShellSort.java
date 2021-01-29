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
public class cShellSort {

    public cShellSort() {
    }
    public void shellSort(ArrayList<Integer> arr) 
    { 
        int n = arr.size(); 

        for (int gap = n/2; gap > 0; gap /= 2) 
        { 
            for (int i = gap; i < n; i += 1){ 
                int temp = arr.get(i); 
  
                int j; 
                for (j = i; j >= gap && arr.get(j - gap) > temp; j -= gap) 
                    arr.set(j, arr.get(j - gap)); 
  
                arr.set(j, temp); 
            }
        }
    }
}
