package com.ninja.lecture_8_Arrays.Assignment;

public class Find_Unique {

    public static int findUnique(int[] arr){
        int uni=0;
        for (int val : arr){
            uni = val^uni;
        }
        return uni;
    }
}
