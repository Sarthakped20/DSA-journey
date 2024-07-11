package com.sarthak;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int ans = sum();
    }
    static int sum(){
        Scanner input = new Scanner(System.in);

        int a= input.nextInt();
        int b= input.nextInt();
        int sum = a+b;
        System.out.println("sum is " + sum);
        return sum;
    }
}
