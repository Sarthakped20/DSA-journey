package com.Arrays;

import java.util.Scanner;

public class eg3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ele = sc.nextInt();
        int [] arr = new int[ele];
//        taking input
        for (int i =0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int max =0;
        int min =0;
        for (int i=0;i< arr.length;i++){
            if ( min>arr[i] && max<arr[i]){
                max=arr[i];
                min = arr[i];
            }
        }
        System.out.println("max ele is :"+max);
        System.out.println("min ele is :"+min);
    }
}
