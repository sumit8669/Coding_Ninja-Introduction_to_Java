package com.ninja.lecture_10_Strings_and_Arrays.Assignment;


public class Check_Permutation {

    public static boolean isPermutation(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;

        //Create an array of size 256
        int[] countarr = new int[256];

        for(int i = 0; i < str1.length(); i++) {
            //Increment character count for str1
            countarr[str1.charAt(i)]++;

            //decrement character count for str2
            countarr[str2.charAt(i)]--;
        }

        for(int j = 0; j < countarr.length; j++) {
            //if it's not zero
            if( countarr[j] != 0) {
                return false;
            }
        }
        return true;
    }
}
