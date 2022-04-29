package com.ninja.lecture_8_Arrays.Assignment;

public class Sort_0_1 {
    public static void sortZeroesAndOne(int[] arr) {
       int nextZero=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == 0) {
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                nextZero++;
            }
        }
    }
}
