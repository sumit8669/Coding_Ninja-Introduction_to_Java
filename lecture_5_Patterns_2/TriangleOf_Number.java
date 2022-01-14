package com.ninja.lecture_5_Patterns_2;

import java.util.Scanner;

public class TriangleOf_Number {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        
        triangleOfNumber(num);
    }

    private static void triangleOfNumber(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=num-i; j++) {
                System.out.print(" ");
            }
             int temp = i;
            for (int j = 1; j <=i; j++) {
                System.out.print(temp);
                temp++;
            }
            for(int dec=(2*i-2);dec>=i;dec--)
            {
                System.out.print(dec);
            }

            System.out.println();
        }
    }
}
