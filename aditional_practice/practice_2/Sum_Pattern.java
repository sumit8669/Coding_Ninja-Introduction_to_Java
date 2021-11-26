package com.ninja.aditional_practice.practice_2;

import java.util.Scanner;

public class Sum_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumPattern(n);
    }

    public static void sumPattern(int n){
        for (int i = 1; i <=n ; i++) {
            System.out.println();
        }
    }
}
