package com.ninja.test1;

import java.util.Scanner;

public class Number_Star_pattern_1 {

    public static void numberStarPattern(int n ){
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >=1; j--) {
                if (j==i)
                    System.out.print("*");
                else
                    System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numberStarPattern(n);

    }
}
