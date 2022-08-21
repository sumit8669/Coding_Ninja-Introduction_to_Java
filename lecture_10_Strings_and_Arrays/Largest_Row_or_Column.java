package com.ninja.lecture_10_Strings_and_Arrays;

public class Largest_Row_or_Column {

    public static void findLargest(int mat[][]){
        boolean isRow=true;
        int rows=mat.length;
        int largest=Integer.MIN_VALUE;

        int num=0;
        if(rows==0){
            System.out.print("row 0 "+largest);
            return ;
        }
        int cols=mat[0].length;

        for(int k=0;k<rows;k++){
            int add=0;
            for(int l=0;l<mat[0].length;l++){
                add+=mat[k][l];
            }
            if(add>largest){
                largest=add;
                num=k;
            }
        }

        for(int j=0;j<cols;j++){
            int sum=0;
            for(int i=0;i<rows;i++){
                sum+=mat[i][j];
            }
            if(sum>largest){
                largest=sum;
                num=j;
                isRow=false;
            }
        }
        if(isRow){
            System.out.print("row "+num+" "+ largest);
        }
        else
        {
            System.out.print("column "+num+" "+largest);
        }
    }
}
