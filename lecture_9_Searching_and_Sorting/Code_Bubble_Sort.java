package com.ninja.lecture_9_Searching_and_Sorting;

import java.util.Arrays;

public class Code_Bubble_Sort {

    public static void bubbleSort(int[] arr){

        //run the steps n-1 times.....
        for (int i = 0; i < arr.length ; i++) {
            //for each step max come at last
            for (int j = 1; j < arr.length-i; j++) {
                // swap if the item is smaller than the previous
                 if (arr[j] < arr[j-1]){
                     //swap
                     int temp = arr[j];
                     arr[j] = arr[j-1];
                     arr[j-1] = temp;
                       }
                 }
            }

        }
    }

