package com.ninja.lecture_10_Strings_and_Arrays;

public class Print_All_Substrings {

    public static void printSubstrings(String str) {
        // 1st loop go to 0 to length-1 index
        for(int i=0;i<str.length();i++){
            //2nd loop go to i+1 0r start after 0 to length of string
            for(int j=i+1;j<=str.length();j++){
                //SUBSTRING PRINT 1 LESS THAN GIVEN INDEX
                System.out.println(str.substring(i,j));
            }
        }
    }
}
