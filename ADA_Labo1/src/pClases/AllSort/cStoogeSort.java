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
public class cStoogeSort {

    public cStoogeSort() {
    }
    public void stooge(ArrayList<Integer> arr){
        int h=arr.size()-1;
        stoogesort(arr, 0, h); 
    }
    public void stoogesort(ArrayList<Integer> arr, int l, int h) 
    { 
        if (l >= h) 
           return;
        if (arr.get(l) > arr.get(h)) 
        { 
            int t = arr.get(l); 
            arr.set(l,arr.get(h)); 
            arr.set(h, t); 
        } 
        if (h-l+1 > 2) 
        { 
            int t = (h-l+1) / 3; 
            stoogesort(arr, l, h-t); 
            stoogesort(arr, l+t, h); 
            stoogesort(arr, l, h-t); 
        } 
    }
}
