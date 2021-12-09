package com.ninja.lecture_5_Patterns_2;

import java.util.Scanner;

public class MirrorNumber_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        mirrorNumber(num);
    }

    public static void mirrorNumber(int input){
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <=input-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
