package com.ninja.lecture_6_Operators_and_ForLoop.Assignment;

import java.util.Scanner;

public class Binary_to_Decimal {

    private static int getValueInDecimal(int num) {
        int pow =1 , decimal=0;

        while(num !=0){
            int dig =num % 10;
            decimal +=dig * pow;
            pow = pow* 2;
            num = num/10;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int biNum = sc.nextInt();
        int result = getValueInDecimal(biNum);
        System.out.println(result);
    }


}
