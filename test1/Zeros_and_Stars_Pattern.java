package com.ninja.test1;


import java.io.IOException;
import java.util.Scanner;

public class Zeros_and_Stars_Pattern {
      static void zeroAndStarPattern(int n){
        int start =1;
        int end = 2*n+1;
        int mid = n+1;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <2*n+1; j++) {
                if (j == start || j==end || j==mid) {
                    System.out.print("*");
                }else {
                    System.out.print("0");
                }
                start++;
                end--;

            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        zeroAndStarPattern(n);

    }
}
