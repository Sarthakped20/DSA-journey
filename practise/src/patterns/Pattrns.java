package patterns;

import java.util.Scanner;

public class Pattrns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);
        System.out.println();
        pattern6(n);
        System.out.println();

    }
    // left triangle
    static void pattern1(int n){
        for (int i =0;i<n;i++){
            for (int j =0;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    //        square
    static void pattern2(int n){
        for (int i =0;i<n;i++){
            for (int j =0;j<n;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    //        upside down left
    static void pattern3(int n){
        for (int i =0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i =0;i<n;i++){
            for (int j =0;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n ){
        for (int i =1;i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int r=0;r<=2*n-1;r++){
            int totalcols = r>n?2*n-r:r;
            for(int c =0;c<totalcols;c++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
