package com.ninja.lecture_6_Operators_and_ForLoop.Assignment;

import java.util.Scanner;

//Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
//        Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.
//
//
//        Input format :
//        Integer N
//        Output format :
//        Corresponding reverse number
//        Constraints:
//        0 <= N < 10^8
//        Sample Input 1 :
//        1234
//        Sample Output 1 :
//        4321
//        Sample Input 2 :
//        1980
//        Sample Output 2 :
//        891
public class Reverse_Of_A_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(reverseNumber(num));
    }
    private static int reverseNumber (int number){
        int rev =0;
        while (number != 0){
            rev = rev * 10 + number%10;
            number/=10;
        }

        return rev;
    }
}
