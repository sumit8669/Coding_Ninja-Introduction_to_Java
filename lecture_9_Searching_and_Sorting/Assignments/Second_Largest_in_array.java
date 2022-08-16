package com.ninja.lecture_9_Searching_and_Sorting.Assignments;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Second_Largest_in_array {

    public static int secondLargestElement(int[] arr) {
        if(arr.length < 2 ) return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE, sndMax= Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++)
        {
            if(max < arr[i])
            {
                sndMax = max;
                max = arr[i];
            }
            else if(sndMax < arr[i] && arr[i] != max)
            {
                sndMax = arr[i];
            }
        }
        return sndMax;
    }

}
