package com.ninja.lecture_10_Strings_and_Arrays.Assignment;

public class Compress_the_String {

    public static String getCompressedString(String str) {
        //RETURNING STRING NOW COUNT ADDED
        String comstr = str.charAt(0)+"";
        int count =1;

        //CHECK CHAR PERVIOUS  WITH CURRNET
        for (int i = 1; i <=str.length()-1 ; i++)
        {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr == prev) count++;
            else
            {
                if(count>1)
                {
                    comstr += count;
                    count =1;
                }
                comstr += curr;
            }
        }
        if(count >1)
        {
            comstr += count;
            count =1;
        }
        return comstr;
    }
}
