package com.ninja.lecture_7_Function_Variables_and_their_Scope;

import java.util.Scanner;

public class Fibonacci_Number {

    public static boolean checkMember(int n){
       int a=0; int b=1;
       while (a<n){
           int c= a+b;
           a =b;
           b =c;
       }
      return a==n;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(checkMember(n));
    }
}
