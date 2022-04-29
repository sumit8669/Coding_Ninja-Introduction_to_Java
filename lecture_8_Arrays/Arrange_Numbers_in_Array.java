package com.ninja.lecture_8_Arrays;

public class Arrange_Numbers_in_Array {
    public static void arrange(int[] arr, int n) {
        int left = 0;
        int right = n-1;
        int count = 1;
        while (left <= right ){
            if (count % 2 == 1) {
                arr[left] = count;
                left++;
            }else{
                arr[right] = count;
                right--;
            }
            count++;
        }
    }
}
