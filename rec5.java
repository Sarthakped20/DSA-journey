package com.recurSion;

public class rec5 {
    public static void main(String[] args) {
//        returning the number of a digit repeating
        System.out.println(count(879675309));

    }
    static int count(int n){
        return helper(n,0);
    }
    private static int helper(int n , int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 7)// here enter the number you want to search  
        {
            return helper(n / 10, c + 1);
        }
        return helper(n / 10, c);
    }
}
