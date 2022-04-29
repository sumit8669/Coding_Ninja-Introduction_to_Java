package com.ninja.lecture_8_Arrays;

public class Linear_Search {
    public static int linearSearch(int[] arr, int x) {
        for(int i =1; i<=arr.length-1; i++){
            if(arr[i]==x){
                return i;
            }


        }
        return -1;
    }
}
