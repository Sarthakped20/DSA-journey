package com.Arrays;

import java.util.Scanner;

public class pc2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        DT name = new DT [size] syntax of array
        int arr[] = new int[num];
//        taking input i.e elements of array
        for (int i =0; i<num;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the number you want to search : ");
        int A = sc.nextInt();
        for (int i =0;i<arr.length;i++){
            if (A==arr[i]){
                System.out.println("found at index :"+i);
            }
        }

    }
}
