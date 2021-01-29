/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pClases;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

/**
 *
 * @author sidmox
 */
public class cOrdenadores {
    
    public cOrdenadores() {
    }
    Integer myInf= Integer.MAX_VALUE;
    /*Con Array */
    public void Insertion_sort(int [] arr){
        int key;
        int j;
        for(int i=0; i<arr.length ;i++){
            key=arr[i];
            j=i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public void Imprimir(int [] arr){
        System.out.println("Variables");
        for(int i=0; i<arr.length ;i++){
            System.out.print(arr[i]+" ,");
        }
    }
    /*Con Array list*/
    public void Insertion_sort(ArrayList<Integer> arr){
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
    public void merge_sort(ArrayList<Integer> arr,int low,int mid, int high){
        
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
            merge_sort(arr, low, mid, high);
        }
    }
    /*RadixSort*/
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
    /*RadixSort*/
    /*QuickSort*/
    public void quick(ArrayList<Integer> arr){
        quicksort(arr,0,arr.size()-1);
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
    /*QuickSort*/
    /*HeapSort*/
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
    /*HeapSort*/
    /*BubbleSort*/
    public void bubbleSort(ArrayList<Integer> arr) 
    {
        int n=arr.size();
        int i, j, temp; 
        boolean swapped; 
        for (i = 0; i < n - 1; i++)  
        { 
            swapped = false; 
            for (j = 0; j < n - i - 1; j++)  
            { 
                if (arr.get(j) > arr.get(j + 1))  
                { 
                    temp = arr.get(j); 
                    arr.set(j, arr.get(j + 1)); 
                    arr.set(j + 1, temp); 
                    swapped = true; 
                } 
            } 
            // IF no two elements were  
            // swapped by inner loop, then break 
            if (swapped == false) 
                break; 
        } 
    }
    /*BubbleSort*/
    /*ShellSort*/
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
    /*ShellSort*/
    /*StoogeSort*/
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
    /*StoogeSort*/
    
    /*BinSort*/   
    /*BinSort*/
    /*BucketSort*/
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
 
    /*BucketSort*/
    /*CountingSort*/
    public void countSort(ArrayList<Integer> arr) {
        int size=arr.size();
        int[] output = new int[size + 1];

        int max = arr.get(0);
        for (int i = 1; i < size; i++) {
          if (arr.get(i) > max)
            max = arr.get(i);
        }
        int[] count = new int[max + 1];

        for (int i = 0; i < max; ++i) {
          count[i] = 0;
        }

        for (int i = 0; i < size; i++) {
          count[arr.get(i)]++;
        }

        for (int i = 1; i <= max; i++) {
          count[i] += count[i - 1];
        }

        for (int i = size - 1; i >= 0; i--) {
          output[count[arr.get(i)] - 1] = arr.get(i);
          count[arr.get(i)]--;
        }

        for (int i = 0; i < size; i++) {
          arr.set(i,output[i]);
        }
    }
    /*CountingSort*/
    
}
