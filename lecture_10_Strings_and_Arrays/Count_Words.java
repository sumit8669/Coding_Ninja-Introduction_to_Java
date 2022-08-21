package com.ninja.lecture_10_Strings_and_Arrays;

public class Count_Words {
    public static int countWords(String str) {
        if (str.length() == 0) {
            return 0;
        }
        String [] arr = str.split(" ");
        return arr.length;
    }
}
