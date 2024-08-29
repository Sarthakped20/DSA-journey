package com.Arrays;

import java.util.Scanner;

public class eg5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int [][] mat = new int [row][cols];
//        taking input for row
        for (int i =0;i<row;i++){
//            taking input of cols
            for (int j=0;j<cols;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for (int i =0;i<row;i++){
//            taking input of cols
            for (int j=0;j<cols;j++){
                System.out.print(mat[i][j]+" ");;
            }
            System.out.println();

        }

        System.out.println("enter the number you want to search : ");
        int x= sc.nextInt();
        for (int i =0;i<row;i++){
//            taking input of cols
            for (int j=0;j<cols;j++){
                if(x==mat[i][j]){
                    System.out.println("number found at index : "+i+", "+j);
                }
            }
        }
    }
}
