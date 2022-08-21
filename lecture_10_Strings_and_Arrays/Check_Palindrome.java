package com.ninja.lecture_10_Strings_and_Arrays;

public class Check_Palindrome {

    public static boolean isPalindrome(String str) {
        int i = 0 , j = str.length()-1;
        while (i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++ ; j--;
        }
        return true;
    }

}
