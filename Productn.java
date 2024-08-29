package com.recurSion;

import org.w3c.dom.ls.LSOutput;

public class Productn {
    public static void main(String[] args) {

//        taking long DT becoz answer can be a large number
        long ans = funct(5);
        System.out.println(ans);
    }
    static long funct (int n){
        if (n<=1){
            return 1;
        }
        return n*funct(n-1);
    }
}
