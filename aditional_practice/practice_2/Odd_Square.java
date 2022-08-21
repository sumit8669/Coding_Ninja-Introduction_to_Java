package com.ninja.aditional_practice.practice_2;
/*
Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357
*/


import java.util.Scanner;

public class Odd_Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddSquare(n);
    }

    public static void oddSquare(int n){
        for (int i = 1; i <= n; i++) {
            int num = 2 * i - 1;
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(num);
                num = num + 2;
            }
            int num2 = 1;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(num2);
                num2 = num2 + 2;
            }
            System.out.println();

        }
    }
}
