package com.recurSion;

public class rec7 {
    public static void main(String[] args) {
        System.out.println(power(2,28));
    }
    static int power(int x,int n){
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        int expo = x*power(x,n-1);
        return expo;
    }
}
