/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comprog2_exercise1;

/**
 *
 * @author alasacriz
 */
public class ComProg2_Exercise1 {

    // Bubble Sort
    public static void main(String[] args) {
        int[] unsorted = new int[5];
        unsorted[0] = 1;
        unsorted[1] = 3;
        unsorted[2] = 2;
        unsorted[3] = 5;
        unsorted[4] = 0;
        
        for(int i = 0; i < unsorted.length - 1; i++)
        {
            for (int j = 0; j < unsorted.length - 1; j++)
            {
                if(unsorted[j] > unsorted[j + 1])
                {
                    int temp = unsorted[j + 1];
                    unsorted[j + 1] = unsorted[j];
                    unsorted[j] = temp;
                            
                }
            }
        }
        for(int i = 0; i < 5; i++)
            System.out.print(unsorted[i]);
    }
}
