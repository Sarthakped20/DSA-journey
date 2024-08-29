package com.recurSion;

public class rec4 {
    public static void main(String[] args) {
        System.out.println(fibo(5));
//        System.out.println(series(5));

    }
    static int fibo(int n) {

        for (int i =0;i<=n;i++){
            if (i < 2) {
                return i;
            }

        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
