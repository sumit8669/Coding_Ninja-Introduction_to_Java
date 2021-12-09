package com.ninja.lecture_3_Conditionals_And_Loops;

import java.util.Scanner;

public class Number_pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <=num ; i++) {
            int val =i;
            for (int j =i; j <=val; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
