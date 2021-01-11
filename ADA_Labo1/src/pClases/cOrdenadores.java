/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pClases;
import java.util.ArrayList;
import java.util.Random;
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
}
