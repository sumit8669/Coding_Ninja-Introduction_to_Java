package com.ninja.lecture_4_Patterns_1;

import java.util.Scanner;

public class InterestingAlphabets_Pattern {

    private static void interestingAlphabet(int input) {
        for (int i =1 ; i <=input ; i++) {
            // NEED SUBTRACTION FROM INPUT WITH CURRENT INDEX
            char alpha =(char)('A'+input-i);
            for(int j = 1; j <= i; j++){
                System.out.print(alpha);
                alpha++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        interestingAlphabet(n);
    }

    
}
