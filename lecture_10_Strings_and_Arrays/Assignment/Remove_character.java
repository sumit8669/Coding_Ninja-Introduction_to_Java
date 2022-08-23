package com.ninja.lecture_10_Strings_and_Arrays.Assignment;

public class Remove_character {

    public static String removeAllOccurrencesOfChar(String str, char ch) {
        String ans="";

        String C=Character.toString(ch);

        //converting char c into String to use String.contains() method

        if(str.contains(C)==false){
            return str;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                ans+=str.charAt(i);
            }
        }

        return ans;
    }
}
