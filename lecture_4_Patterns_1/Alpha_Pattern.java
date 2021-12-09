package com.ninja.lecture_4_Patterns_1;

import java.util.Scanner;

public class Alpha_Pattern {
    
    private static void alphaPattern(int input){
        for (int i = 1; i <=input ; i++) {
            for (int j =1; j <=i ; j++) {
                System.out.print((char) ('A'+i-1));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        alphaPattern(n);
    }
}
