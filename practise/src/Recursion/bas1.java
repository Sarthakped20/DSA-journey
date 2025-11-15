package Recursion;

import java.util.Scanner;

public class bas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n ;
//        int n = sc.nextInt();
//        fun(n);
//        System.out.println();
//        System.out.println("reverse!");
//        revfun(n);
//        System.out.println();
//        fact(5);
        int ans = sum(4);
        System.out.println(ans);
    }
    static void fun(int n){
        if (n==0){
            return;
        }
        System.out.print(n+" ");
        fun(n-1);
    }
    static void revfun(int n){
        if (n==0){
            return;
        }
        revfun(n-1);
        System.out.print(n+" ");
    }

    static int fact(int n){
        if (n<2){
            return 1;
        }
        return n*fact(n-1);
    }
    static int sum (int n){
        if (n<2){
            return 1;
        }
        return n+sum(n-1);
    }
}
