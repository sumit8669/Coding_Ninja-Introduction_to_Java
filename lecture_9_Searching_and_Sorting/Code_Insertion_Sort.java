package com.ninja.lecture_9_Searching_and_Sorting;

public class Code_Insertion_Sort {
    // outer loop run upto n-2 index of array
    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            // j starts from i+1 back to 0
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    static void swap(int[]  arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
