package com.ninja.lecture_9_Searching_and_Sorting;


public class Code_Merge_Two_Sorted_Arrays {


    public static int[] merge(int arr1[], int arr2[]) {
        if(arr1.length == 0 )return arr2;
        if(arr2.length == 0 )return arr1;

        int  n = arr1.length + arr2.length;
        int arr3 [] = new int [n];


        int i=0,j=0,k=0;

        while(i<arr1.length  && j<arr2.length){
            if(arr1[i] <= arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }else{
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length){
            arr3[k] = arr1[i];
            i++; k++;
        }
        while (j < arr2.length){
            arr3[k] = arr2[j];
            j++; k++;
        }
        return arr3;
    }

}
