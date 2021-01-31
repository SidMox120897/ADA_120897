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
public class cInsertionSort {

    public cInsertionSort() {
    }
    
    public void InsertionSort(ArrayList<Integer> arr){
        int key;
        int j;
        for(int i=0; i<arr.size() ;i++){
            key=arr.get(i);
            j=i-1;
            while(j>=0 && key<arr.get(j)){
                arr.set(j+1, arr.get(j));
                j--;
            }
            arr.set(j+1, key);
        }
    }
}
