package com.ninja.aditional_practice.practice_2;

import java.util.Scanner;

public class Half_Diamond_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternHalfDiamond(n);
    }

    public static void patternHalfDiamond(int n ){
        System.out.println("*");
        //UPPER PART
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for ( int j = 1; j <=i ; j++) System.out.print(j);
            for(int j=i-1; j>=1; j--) System.out.print(j);
            System.out.print("*");
            System.out.println();
        }
        //LOWER PART
        for (int i = n-1; i >=1 ; i--) {
            System.out.print("*");
            for (int j = 1; j <=i ; j++) System.out.print(j);
            for(int j=i-1; j>=1; j--) System.out.print(j);
            System.out.print("*");
            System.out.println();
        }
        System.out.println("*");
    }

}
//        *
//        *1*
//        *121*
//        *12321*
//        *121*
//        *1*
//        *