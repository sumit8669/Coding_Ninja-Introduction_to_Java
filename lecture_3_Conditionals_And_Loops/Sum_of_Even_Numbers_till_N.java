package com.ninja.lecture_3_Conditionals_And_Loops;

import java.util.Scanner;

public class Sum_of_Even_Numbers_till_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;

        for (int i = 2; i <= num; i++) {
            if(i % 2==0) sum +=i;
        }

        System.out.println(sum);
    }
}
