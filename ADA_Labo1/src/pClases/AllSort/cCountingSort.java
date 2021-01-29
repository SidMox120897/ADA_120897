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
public class cCountingSort {

    public cCountingSort() {
    }
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
}
