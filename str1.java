package com.Strings;

import java.util.Scanner;

public class str1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String arr[] = new String[size];
        int totalChar =0;

        for (int i=0;i<size;i++){
            arr [i]= sc.next();
            totalChar += arr[i].length();
        }

        System.out.println(totalChar);

    }
}
