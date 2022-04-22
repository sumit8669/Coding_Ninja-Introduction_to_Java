package com.ninja.lecture_6_Operators_and_ForLoop.Assignment;

import java.util.Scanner;

public class Decimal_to_Binary {

    public static int getValueInBinary(int num){
        int binary=0, pow=1;

        while(num >0){
            int dig = num % 2;
            num/=2;

            binary+=dig*pow;
            pow*=10;

        }
        return binary;
    }



    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int Num = sc.nextInt();
        int result = getValueInBinary(Num);
        System.out.println(result);
    }
}
