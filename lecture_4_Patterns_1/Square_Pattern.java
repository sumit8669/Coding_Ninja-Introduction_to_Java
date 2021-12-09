package com.ninja.lecture_4_Patterns_1;

import java.util.Scanner;

public class Square_Pattern {
    public static void squarePattern(int n){
        for (int i = 0; i < n  ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        squarePattern(n);
    }
}
