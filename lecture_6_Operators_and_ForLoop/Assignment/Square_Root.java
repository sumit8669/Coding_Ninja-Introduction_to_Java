package com.ninja.lecture_6_Operators_and_ForLoop.Assignment;

import java.util.Scanner;

public class Square_Root {

    public static int sqaureRoot(int n){
        return (int)Math.sqrt(n);
    }

    public static int squareRoot1(int n ){
        int result=0;

        while(result*result <=n){
            result++;
        }

        return result-1;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sqaureRoot(num));
        System.out.println(squareRoot1(num));
    }
}
