package com.Arrays;

import java.util.Scanner;

public class Acc1 {
    public static void main(String[] args) {
//        System.out.println(acc());

    }
    static int acc(int[]arr,int r,int u,int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rats : ");
         r = sc.nextInt();
        System.out.println("enter the number of unit : ");
         u = sc.nextInt();
        int totalfood = r*u;
        System.out.println("enter the number of house : ");
         n = sc.nextInt();
//         if null
        if (n==0){
            return -1;
        }
//        array input
        for (int i =0;i<=arr.length;i++){
            arr[i]= sc.nextInt();
        }
//        check if food is sufficient
        int count=0;
        int food =0;
        for (int i=0;i< arr.length;i++){
            food = food+arr[i];
        }
//        if food is not sufficient
        if (food<totalfood){
            return 0;
        }
//        give the total index of house need to provide food
        for (int i=0;i< arr.length;i++){
            if (totalfood<food){
                count =  i+1;

            }
        }
        return 0;
    }
}
