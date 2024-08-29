package com.recurSion;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        long n = sc.nextInt();
        System.out.println("The factorial is : "+facto(n));
    }
    public static long facto(long n){
        if(n<2){
            return 1;
        }
        return n * facto(n-1);
    }
}
