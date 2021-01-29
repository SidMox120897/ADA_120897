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
public class cRadixSort {

    public cRadixSort() {
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
    public void radix(ArrayList<Integer> arr){
        
        int n=arr.size();
        int result[] = new int[n];
        int k=getMax(arr);
        int count[]=new int[10];
        
        for(int i=0 ; i<n ; i++)
            result[i]=0;
        
        for(int exp=1 ; k/exp > 1 ; exp*=10){
            for(int i=0 ; i<10 ; i++)
                count[i]=0;
            
            for(int i=0 ; i<n ; i++)
                count[(arr.get(i)/exp)%10]++;
            
            for(int i=1 ; i<10 ; i++)
                count[i]+=count[i-1];
            
            for(int i=n-1 ; i>=0 ; i--){
                result[count[(arr.get(i)/exp)%10]-1] = arr.get(i);
                count[(arr.get(i)/exp)%10]--;
            }
            for(int i=0 ; i<n ; i++)
                arr.set(i, result[i]);
        }
    }
}
