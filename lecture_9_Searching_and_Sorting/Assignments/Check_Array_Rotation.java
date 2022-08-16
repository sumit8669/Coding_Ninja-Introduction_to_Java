package com.ninja.lecture_9_Searching_and_Sorting.Assignments;

public class Check_Array_Rotation {

    public static void main(String[] args) {
        int[] ar = {5,6,1,2,3,4,5};
        int ans = arrayRotateCheck(ar);
        System.out.println(ans);
    }
    public static int arrayRotateCheck(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > arr[i+1]) {
            return i+1;
            }
        }
        return 0;
    }
}
