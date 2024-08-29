package com.Arrays;

import java.util.Scanner;

public class exp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int [size];
//        for input
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
//        for printig output
        for (int i =0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
