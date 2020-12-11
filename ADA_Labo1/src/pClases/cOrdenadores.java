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
}
