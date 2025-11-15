package normalprac;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        pattern3(5);
    }
    static void pattern1(int n){

        for (int row =1; row <= 2*n-1; row++) {
            int totalcols = row>n?2*n-row:row;
            for (int col =1 ; col<=totalcols;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row =1; row <= 2*n-1; row++) {
            int totalcols = row>n?2*n-row:row;
            int totalspace = n-totalcols;
            for (int s =0;s<totalspace;s++){
                System.out.print(" ");
            }
            for (int col =1 ; col<=totalcols;col++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern3(int n){
        for (int r =1;r<=n;r++){
            int totalcols = r>n?2*n-r:r;
            int totalspace = n-totalcols;
            for (int s =0;s<totalspace;s++){
                System.out.print(" ");
            }
            for (int c = r;c>=1;c--){
                System.out.print(c);
            }
            for (int c = 2 ; c<=r;c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
