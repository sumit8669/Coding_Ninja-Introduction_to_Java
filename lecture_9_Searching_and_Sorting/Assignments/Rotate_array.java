package com.ninja.lecture_9_Searching_and_Sorting.Assignments;

import java.util.Arrays;

public class Rotate_array {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        rotate(arr,2);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int d) {
      //      d = d % arr.length;                      for bigger value of d
       //  if (d < 0){ d = d + arr.length;}            for negative value of d
        // clock wise rotation
         reverse(arr,0,d-1);
         reverse(arr,d, arr.length-1);
         reverse(arr,0, arr.length-1);

    }

    private static void reverse (int []arr,int i ,int j){
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++; j--;
        }
    }
}
