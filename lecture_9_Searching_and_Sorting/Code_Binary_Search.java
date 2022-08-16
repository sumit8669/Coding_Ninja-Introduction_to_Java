package com.ninja.lecture_9_Searching_and_Sorting;

public class Code_Binary_Search {
    public static int binarySearch(int[] arr, int x) {
        int start =0;
        int end = arr.length-1;

        while(start <= end) {
            //if start and end big then this formula use
            int middle = start+(end-start)/2;
            if(x < arr[middle]) {
                end = middle-1;
                    }
            else if (x > arr[middle]) {
                start = middle+1;
            }else
                return middle;

        }

        return -1;
    }
}
