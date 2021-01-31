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
public class cMergeSort {
    Integer myInf= Integer.MAX_VALUE;
    
    public cMergeSort() {
    }
        public void mergeSort(ArrayList<Integer> arr,int low,int mid, int high){
        
        int n1=mid-low+1;
        int n2=high-mid;
        
        ArrayList<Integer> arrL=new ArrayList();//Left Izquierda
        ArrayList<Integer> arrR=new ArrayList();//Derecha
        
        for(int i=0;i<n1;i++){
            arrL.add(arr.get(low+i));
        }
        for(int j=0;j<n2;j++){
            arrR.add(arr.get(mid+j+1));
        }
        arrL.add(myInf);
        arrR.add(myInf);
        
        int lIndex=0;
        int rIndex=0;
        
        for (int i = low; i < high + 1; i++) {
            if(arrL.get(lIndex) <= arrR.get(rIndex)){
                arr.set(i, arrL.get(lIndex));
                lIndex++;
            }else{
                arr.set(i, arrR.get(rIndex));
                rIndex++;
            }
        }
    }
    public void merge(ArrayList<Integer> arr,int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            merge(arr, low, mid);
            merge(arr, mid+1, high);
            mergeSort(arr, low, mid, high);
        }
    }
    
}
