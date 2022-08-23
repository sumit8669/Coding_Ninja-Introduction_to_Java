package com.ninja.lecture_10_Strings_and_Arrays.Assignment;

public class Highest_Occuring_Character {
    public static char highestOccuringChar(String str) {
        int arr[]=new int[256];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)]=arr[str.charAt(i)]+1;
        }

        int largest=Integer.MIN_VALUE;
        char hoc='0';
        for(int j=0;j<str.length();j++){
            int k=arr[str.charAt(j)];
            if(k>largest){
                largest=k;
                hoc=str.charAt(j);
            }

        }
        return hoc;
    }
}
