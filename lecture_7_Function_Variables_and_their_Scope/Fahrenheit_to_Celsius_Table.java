package com.ninja.lecture_7_Function_Variables_and_their_Scope;

import java.util.Scanner;

public class Fahrenheit_to_Celsius_Table {
    public static void printFahrenheitTable(int start, int end, int step) {
       while (start <= end){
            int fahr=(int) ((5.0/9)*(start-32));
           System.out.println(start+" "+fahr);
           start +=step;
       }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        int step = s.nextInt();
        printFahrenheitTable(start, end, step);
    }
}
