package com.recurSion;

public class sumdigit {
    public static void main(String[] args) {
        int ans = sod(65865);
        System.out.println(ans);
    }
    static int sod(int n){
        if (n==0){
            return 0;
        }
        int rem =n%10 + sod(n/10);
        return rem%10 + rem/10;
    }
}
