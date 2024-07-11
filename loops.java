package com.sarthak;
import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        for (int i=0;i<=n;i++){
//            System.out.println(i);
//        }
//print no from 1 to 5
//        for (int i=0 ; i<5;i++){
//            System.out.println(i);
//        }
//        ***fibonacci series***
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;

        }
        System.out.println(b);
    }
}
