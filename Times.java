package com.recurSion;

public class Times {
    public static void main(String[] args) {
        fun(6);
        funRev(7);
        funcbth(5);
    }
    static void fun (int n){
        if (n==0){
            return;
        }
        fun (n-1);
        System.out.println(n);

    }
    static void funRev(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fun (n-1);

    }
    static void funcbth(int n){
            if (n==0){
                return;
            }
        fun (n-1);
            System.out.println(n);
            fun (n-1);
        }

}
