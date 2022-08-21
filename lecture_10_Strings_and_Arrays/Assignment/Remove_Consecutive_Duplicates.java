package com.ninja.lecture_10_Strings_and_Arrays.Assignment;

public class Remove_Consecutive_Duplicates {

    public static String removeConsecutiveDuplicates(String str) {
          String ans = "";
          ans = ans+str.charAt(0);
        for (int i = 1; i <=str.length()-1; i++) {
            if (str.charAt(i) != str.charAt(i-1)){
                  ans +=str.charAt(i);
            }
        }
          return ans;
    }
}
