package com.ninja.lecture_9_Searching_and_Sorting.Assignments;

import java.util.Arrays;

public class Push_Zeros_to_end {
    public static void main(String[] args) {
        int [] arr = {2 ,0 ,0, 1, 3 ,0 ,0};
        pushZerosAtEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void pushZerosAtEnd(int[] arr) {
        int nonZero =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] !=0){
                int temp = arr[i];
                arr[i] = arr[nonZero];
                arr[nonZero] = temp;
                nonZero++;
            }
        }

    }
}
