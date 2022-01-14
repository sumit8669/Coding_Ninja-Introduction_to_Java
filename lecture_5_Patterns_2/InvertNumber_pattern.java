package com.ninja.lecture_5_Patterns_2;

import java.util.Scanner;

public class InvertNumber_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        invertedNumber(num);
    }

    public static void invertedNumber(int input){
        for (int i =input; i >= 1; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print(input);
            }
            input--;
            System.out.println();
        }
    }
}
