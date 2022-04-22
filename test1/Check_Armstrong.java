package com.ninja.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Check_Armstrong {
    public static boolean armstrongNumber(int n){
        int temp=n,newNum=n; int count=0 ,sum=0;

        while(temp > 0){
            temp/=10;
            count++;
        }
        while(newNum >0){
            int lastDigit = n%10;
            sum +=Math.pow(lastDigit,count);
            newNum/=10;
        }

        return sum==n;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(armstrongNumber(n));



    }
}
