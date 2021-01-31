/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pClases;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import pClases.AllSort.cBubbleSort;
import pClases.AllSort.cBucketSort;
import pClases.AllSort.cCountingSort;
import pClases.AllSort.cHeapSort;
import pClases.AllSort.cRadixSort;
import pClases.AllSort.cShellSort;
import pClases.AllSort.cStoogeSort;
import pClases.AllSort.cQuickSort;
import pClases.AllSort.cInsertionSort;
import pClases.AllSort.cMergeSort;
import pClases.AllSort.cBinSort;
/**
 *
 * @author sidmox
 */
public class cOrdenadores {
    
    public cOrdenadores() {
    }
    Integer myInf= Integer.MAX_VALUE;
    /*Funciones elementales*/
    public int getMax(ArrayList<Integer> arr){
        int max=arr.get(0);
        int n=arr.size();
        for(int i=1 ; i<n ;i++){
            if(arr.get(i) > max)
                max=arr.get(i);
        }
        return max;
    }
    public void LlenarArreglo(ArrayList<Integer> arr,int m){
        arr.clear();
        Random r = new Random();
        for(int i=0; i<m ;i++){
            arr.add(r.nextInt(1000)+1);
        }
    }
    public void Imprimir(ArrayList<Integer> arr){
        System.out.println("Variables");
        for(int i=0; i<arr.size() ;i++){
            System.out.print(arr.get(i)+" ,");
        }
    }
    public String TodosLosValores(ArrayList<Integer> arr){
        String n="Valores \n";
        for(int i=0; i<arr.size() ;i++){
            if(i==arr.size()-1){
                n+=arr.get(i).toString()+" \n";
            }else{
                if(i%10!=0 || i==0){
                    n+=arr.get(i).toString()+", ";                
                }else{
                    n+=arr.get(i).toString()+", \n";
                }
            }
        }
        return n;
    }
    /*Funciones elementales*/
    /*InsertionSort*/
    public void insertionSort(ArrayList<Integer> arr){
        cInsertionSort Oper=new cInsertionSort();
        Oper.InsertionSort(arr);
    }
    /*InsertionSort*/
    /*MergeSort*/
    public void mergeSort(ArrayList<Integer> arr){
        cMergeSort Oper=new cMergeSort();
        Oper.merge(arr, 0, arr.size()-1);
    }
    /*MergeSort*/
    /*RadixSort*/
    public void radixSort(ArrayList<Integer> arr){
        cRadixSort Oper=new cRadixSort();
        Oper.radix(arr);
    }
    /*RadixSort*/
    /*QuickSort*/
    public void quickSort(ArrayList<Integer> arr){
        cQuickSort Oper=new cQuickSort();
        Oper.quicksort(arr, 0, arr.size()-1);
    }
    /*QuickSort*/
    
    /*HeapSort*/
    public void heapsort(ArrayList<Integer> arr){
        cHeapSort Oper=new cHeapSort();
        Oper.heapsort(arr);
    }
    /*HeapSort*/
    
    /*BubbleSort*/
    public void bubbleSort(ArrayList<Integer> arr){
        cBubbleSort Oper=new cBubbleSort();
        Oper.bubbleSort(arr);
    }
    /*BubbleSort*/
    
    /*ShellSort*/
    public void shellSort(ArrayList<Integer> arr){
        cShellSort Oper=new cShellSort();
        Oper.shellSort(arr);
    } 
    /*ShellSort*/
    
    /*StoogeSort*/
    public void stoogeSort(ArrayList<Integer> arr){
        cStoogeSort Oper =new cStoogeSort();
        Oper.stooge(arr);
    }
    /*StoogeSort*/
    
    /*BinSort*/
    public void binSort(ArrayList<Integer> arr){
        cBinSort Oper =new cBinSort();
        Oper.binSort(arr);
    }
    /*BinSort*/
    
    /*BucketSort*/
    public void bucketSort(ArrayList<Integer> arr){
        cBucketSort Oper =new cBucketSort();
        Oper.bucketSort(arr);
    }
    /*BucketSort*/

    /*CountingSort*/
    public void countSort(ArrayList<Integer> arr){
        cCountingSort Oper=new cCountingSort();
        Oper.countSort(arr);
    }
    /*CountingSort*/
}
