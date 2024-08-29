package com.recurSion;

public class rec6 {
    public static void main(String[] args) {
//        System.out.println(steps(14));
    }
    public int steps(int n ){
        return helper(n ,0);
    }
    private  int helper(int n , int step){
        if (n == 0){
            return step;
        }
        if (n%2 == 0) {
            return helper(n / 2, step + 1);
        }
        return helper(n-1,step+1);
    }
}
