package com.patterns;

public class Two {
    public static void main(String[] args) {
        pattern2(4);
        pattern3(4);
        pattern4(6);
        pattern5(4);
        pattern6(4);
    }
    static void pattern2(int n){
        for (int rows = 1;rows<=n;rows++){
//            yeh loop rows print karega i.e lines of pattern
            for (int cols=1; cols<=n;cols++){
//                yeh loop main chiz print karega
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern3(int n){
        for (int rows =1;rows<=n;rows++){
            for (int cols=1; cols<= n-rows +1;cols++){
//                yeh loop print karega
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int rows =1;rows<=n;rows++){
            for (int cols=1; cols<=rows;cols++){
//                yeh loop print karega
                System.out.print(cols);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row=0;row<=n;row++){
            for (int cols=1;cols<=row;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row=1;row<=n;row++){
            for (int cols=1;cols<=n-row;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int row=0;row<=n;row++){
            for (int cols=1;cols<=row;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row=0;row<=n;row++)
//        aagar 2 lines chahiye toh 0 aur 1 base line chahiye toh 1
        {
            for (int cols=1;cols<=n-row;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
