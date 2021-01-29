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
public class cHeapSort {

    public cHeapSort() {
    }
    
    public void heapsort(ArrayList<Integer> arr){
        int n = arr.size();
 
        for (int i = n/2-1; i >= 0; i--)
            heapify(arr, i, n);
 
        for (int i = n-1; i > 0; i--) {
            int temp = arr.get(0);
            arr.set(0, arr.get(i));
            arr.set(i, temp);
            heapify(arr, 0, i);
        }
    }
    public void heapify(ArrayList<Integer> arr,int i, int n){
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
 
        if (l < n && arr.get(l) > arr.get(largest))
            largest = l;
 
        if (r < n && arr.get(r) > arr.get(largest))
            largest = r;
 
        if (largest != i) {
            int swap = arr.get(i);
            arr.set(i, arr.get(largest));
            arr.set(largest, swap);

            heapify(arr, largest, n);
        }
    }
}
