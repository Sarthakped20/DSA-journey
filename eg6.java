package com.Arrays;

import java.util.Scanner;

public class eg6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int [][]arr = new int[row][cols];
//        taking rows
        for (int i =0;i<row;i++){
//            taking columns
            for (int j =0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
//        printing the matrix
        for (int i =0;i<row;i++){
//            taking columns
            for (int j =0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//        printing the transpose of array
        System.out.println("printing transpose:");
        for (int i=0;i<cols;i++){
//            taking columns
            for (int j =0;j<row;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
