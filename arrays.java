package com.sarthak;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
//        multidimensional arrays
        Scanner sc;
        sc = new Scanner(System.in);
//        int [][] nums = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
        int [][] arr = new int[3][3];


//        input



        for (int row = 0 ; row <arr.length;row++){
            for (int cols = 0; cols<arr[row].length;cols++){
                arr[row][cols]= sc.nextInt();
            }
        }
        for (int row = 0 ; row <arr.length;row++) {
            for (int cols = 0; cols < arr[row].length; cols++) {
                System.out.print(arr[row][cols]+" ");
            }System.out.println();
        }

    }
}
