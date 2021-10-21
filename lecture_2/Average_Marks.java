package com.ninja.lecture_2;
import java.util.Scanner;
public class Average_Marks {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int mrk1 = sc.nextInt();
    int mrk2 = sc.nextInt();
    int mrk3 = sc.nextInt();
    sc.close();

    char name = str.charAt(0);
    int avg_marks = (mrk1+mrk2+mrk3)/3;

        System.out.println(name);
        System.out.println(avg_marks);

    }

}
