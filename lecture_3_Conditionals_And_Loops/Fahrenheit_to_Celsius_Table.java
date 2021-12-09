package com.ninja.lecture_3_Conditionals_And_Loops;

import java.util.Scanner;

public class Fahrenheit_to_Celsius_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();

        for (int i = s; i <=e; i+=w) {
        int fahr = ((5*(i-32))/9);
            System.out.println(i +" "+ fahr);
        }

    }
}
