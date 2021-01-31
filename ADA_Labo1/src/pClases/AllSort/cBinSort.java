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
public class cBinSort {

    public cBinSort() {
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

    public void binSort(ArrayList<Integer> arr){
        int n=arr.size();
        int m=getMax(arr);
        int bin[]=new int[m+1];
        
        for(int i=0;i<m+1;i++){
             bin[i]=-1;
        }
        
        for(int i=0;i<n;i++){
            bin[arr.get(i)]=arr.get(i);
        }
        
        int cont=0;
        for(int i=0;i<m+1;i++){
            if(bin[i]!=-1){
                arr.set(cont,bin[i]);
                cont++;
            }
        }  
    }

}
