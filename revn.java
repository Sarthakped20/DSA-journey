package com.recurSion;

public class revn {

    static int sum = 0;
    static void revno (int n){
        if (n==0){
            return;
        }
        int rem = n%10 ;
        sum = sum * 10 + rem;
        revno(n/10);
    }

    public static void main(String[] args) {
        revno(145638);
        System.out.println(sum);
    }
}
