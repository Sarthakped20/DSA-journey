package com.recurSion;

public class product {
    public static void main(String[] args) {
        int ans = prod(536);
        System.out.println(ans);
    }
    static int prod(int n){
        if (n%10 ==n){
            return n;
        }
        return (n%10)*prod(n/10);
    }
}
