package com.ninja.lecture_4;

import java.util.Scanner;

public class ReverseNumber_Pattern {
    private static void reverseNumberPattern(int input){
        for (int i = 1; i <= input ; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseNumberPattern(n);
    }

}
