package com.patterns;

public class First {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for (int rows =0;rows<=n;rows++){
//            running the loop for every column
            for (int cols=1;cols<=rows ;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
