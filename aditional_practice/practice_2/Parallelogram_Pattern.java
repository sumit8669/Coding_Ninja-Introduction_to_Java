package com.ninja.aditional_practice.practice_2;

import java.util.Scanner;

public class Parallelogram_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         parallelogramPattern(n);
    }

    public static void parallelogramPattern(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j =1; j <i ; j++) System.out.print(" ");
            for (int j = 1; j <=n ; j++) System.out.print("*");
            System.out.println();
        }

    }
}
