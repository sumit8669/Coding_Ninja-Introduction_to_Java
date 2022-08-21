package com.ninja.lecture_10_Strings_and_Arrays.Assignment;

import java.util.Arrays;

public class Reverse_Each_Word {
    public static void main(String[] args) {
        String str = "hello world my name is bitu";
        System.out.println(reverseEachWord(str));
    }
    public static String reverseEachWord(String str) {
        // 1ST SET STRING WORDS INTO ARRAY
        String [] words =str.split(" ");   //java,programming
        String revStr="";				// STORED REVERSED STRING -

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revWord ="";
            for (int j = word.length()-1; j>=0 ;j--) {
                revWord +=word.charAt(j);  //REVERSED WORD - avaj
            }
            revStr += revWord+" "; //REVERSED STRING
        }
        return revStr;
    }

}

