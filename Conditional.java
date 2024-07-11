package com.sarthak;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your  salary :");
        int salary = input.nextInt();
        if (salary > 10000){
            salary +=2000;
        } else if (salary > 20000) {
            salary += 3000;
        }else {
            salary += 1000;
        }
        System.out.println("Salary is :"+salary);

    }
}
