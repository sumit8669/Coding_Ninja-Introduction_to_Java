package com.ninja.lecture_6_Operators_and_ForLoop.Assignment;

import java.util.Scanner;

public class Check_Number_sequence {

    public static boolean checkOrder(int [] arr){
       boolean result = true;
        for (int i = 0; i <arr.length-2; i++) {
            if (arr[i] == arr[i+1])
                return !result;
            if(arr [i] < arr[i+1] && arr[i+1] > arr[i+2])
                return !result;
        }
       return result;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(checkOrder(arr));
    }
}
