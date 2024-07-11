package com.sarthak;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Enter operator");
            char op = input.next().trim().charAt(0);
            if (op =='+' || op =='-' || op =='*' || op == '/' || op =='%') {
                System.out.println("Enter two numbers:");
                int n1 = input.nextInt();
                int n2 = input.nextInt();
                if (op == '+') {
                    System.out.println(n1 + n2);
                }
                if (op == '-') {
                    System.out.println(n1 - n2);
                }
                if (op == '*') {
                    System.out.println(n1 * n2);
                }
                if (op == '/') {
                    if (n2 != 0) {
                        System.out.println(n1 / n2);
                    }
                }
                if (op == '%') {
                    System.out.println(n1 % n2);
                }
            } else if ( op == 'x'|| op == 'X') {
                    break;
            } else {
                    System.out.println("Invalid Operator");
                }
            }
        System.out.println( ans);
        }


    }

