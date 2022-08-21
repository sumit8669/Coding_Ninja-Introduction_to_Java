package com.ninja.lecture_10_Strings_and_Arrays;

import java.util.Scanner;

public class Wave_Print {

    //1st method to print wave
    public static void wavePrint(int mat[][]){
        //IF LENGTH IS 0 JUST RETURN
        if(mat.length==0){return;}
        //1ST PRINT COLUMN WISE
        for (int i = 0; i < mat[0].length; i++) {
            //IF COLUMN IS EVEN PRINT -> TOP-BOTTOM

            if (i%2==0){
                for (int j = 0; j < mat.length; j++) {
                    System.out.print(mat[j][i]+" ");
                }
            // IF COLUMN IS ODD PRINT -> BOTTOM-TOP(JUST REVERSE)
            }else {
                for (int j = mat.length-1;j >= 0; j--) {
                    System.out.print(mat[j][i]+" ");
                }
            }
        }
    }
    // 2nd method to print wave
    public static void wavePrint2(int mat[][]){
        int k=0,c=mat.length-1;
        if(mat.length!=0){
            k=mat[0].length;
        }
            for(int j=0;j<k;j++){
                for(int i=0;i<mat.length;i++){

                    if(j%2!=0){
                        System.out.print(mat[c][j]+" ");
                        c--;
                    }
                    else {
                        c=mat.length-1;
                        System.out.print(mat[i][j]+" ");
                    }

                }
        }
    }

}

