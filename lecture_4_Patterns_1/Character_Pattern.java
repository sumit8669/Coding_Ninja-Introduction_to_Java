package com.ninja.lecture_4_Patterns_1;

import java.util.Scanner;

public class Character_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        characterPattern(n);
    }

    private static void characterPattern(int input) {

        for (int i = 1; i <=input ; i++) {
            // NEED ADDITION OF CURRENT INDEX WITH CHARACTER
            char startingChar = (char)('A'+i-1);
            for (int j = 1; j <=i ; j++) {
                System.out.print(startingChar);
                startingChar++;
            }

            System.out.println();
        }
    }
}
