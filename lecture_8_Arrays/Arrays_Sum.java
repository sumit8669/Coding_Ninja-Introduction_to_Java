package com.ninja.lecture_8_Arrays;

public class Arrays_Sum {
    public static int sum(int[] arr) {
        int sum =0;
        for(int i =0; i<arr.length; i++){
            sum +=arr[i];
        }
        return sum;
    }
}
