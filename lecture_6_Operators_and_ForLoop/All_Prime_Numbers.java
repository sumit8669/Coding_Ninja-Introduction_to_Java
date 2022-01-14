package com.ninja.lecture_6_Operators_and_ForLoop;

import java.util.Scanner;

public class All_Prime_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number  =  sc.nextInt();
        allPrimeNum(number);
    }
    public static void allPrimeNum(int number){
        for(int i =2; i <=number; i++)
        {
            int temp=0;
            for (int j = 2; j <i; j++)
            {
                if(i%j ==0) {
                    temp++;
                    break;
                }
            }
            if(temp ==0) {
                System.out.println(i);
            }
        }
        
    }
}
