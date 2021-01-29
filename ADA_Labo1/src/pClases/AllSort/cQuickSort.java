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
public class cQuickSort {

    public cQuickSort() {
    }
    public void quicksort(ArrayList<Integer> arr, int low, int high){
        if(low<high){
            int partindex= partition(arr,low, high);
            quicksort(arr,low,partindex-1);
            quicksort(arr,partindex+1,high);
        }
    }
    public int partition(ArrayList<Integer> arr, int low, int high){
        int pivot=arr.get(high);
        int i=low-1;
        for(int j=low ; j<high-1 ; j++){
            if (arr.get(j) <= pivot && i<j) {
                i++;
                int swapTemp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, swapTemp);
            }
        }
        int swapTemp = arr.get(i+1);
        arr.set(i+1, arr.get(high));
        arr.set(high, swapTemp);
        return i+1;
    }
}
