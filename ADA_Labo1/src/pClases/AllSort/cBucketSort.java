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
public class cBucketSort {

    public cBucketSort() {
    }
    public int getMax(ArrayList<Integer> arr){
        int max=arr.get(0);
        int n=arr.size();
        for(int i=1 ; i<n ;i++){
            if(arr.get(i) > max)
                max=arr.get(i);
        }
        return max;
    }
    public void bucketSort(ArrayList<Integer> arr) 
    {
        int max_value=getMax(arr);
        int n=arr.size();
        int[] bucket = new int[max_value + 1];
        int[] sorted_arr = new int[n];
 
        for (int i= 0; i <n; i++)
            bucket[arr.get(i)]++;
 
        int pos = 0;
        for (int i = 0; i < bucket.length; i++)
            for (int j = 0; j < bucket[i]; j++)
                sorted_arr[pos++] = i;
        
        for(int i=0;i<sorted_arr.length;i++)
            arr.set(i, sorted_arr[i]);
    }
}
