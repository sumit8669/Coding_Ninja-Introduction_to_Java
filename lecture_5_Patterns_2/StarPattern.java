package com.ninja.lecture_5_Patterns_2;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int digit =  sc.nextInt();
        starPattern( 3);
        
    }

    private static void starPattern(int input) {
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=input-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = i-1; j >=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
