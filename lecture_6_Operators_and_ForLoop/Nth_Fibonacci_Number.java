package com.ninja.lecture_6_Operators_and_ForLoop;

import java.util.Scanner;

public class Nth_Fibonacci_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        looping(number);
       // System.out.println(nthFibboNum(number));

    }

    //Using iterative approach
    public static void looping(int number){
        int t1 = 0 , t2 = 1;
        for (int i = 1; i <= number; ++i)
        {
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            if(i==number)
            {
                System.out.print(t1);
            }
        }
    }
    //Using recursion approach
    public static int nthFibboNum(int n){
        if (n ==0 || n==1) return n;
        return nthFibboNum(n-1) + nthFibboNum(n-2);
    }


}
