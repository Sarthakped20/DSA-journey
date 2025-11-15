package OOPS;

import java.util.Scanner;

class Atm{
    float balance;
    final int pin = 4836;
//    calling checkpin function using a CONSTRUCTOR
    Atm(){
        System.out.println("Enter your PIN : ");
        Scanner sc = new Scanner(System.in);
        int entpin = sc.nextInt();

        if (entpin == pin){
            menu();

        }
        else {
            System.out.println("Enter a valid PIN.");
//            menu();
            new Atm();

        }
    }
//    calling checkpin without using constructor
//    public void Checkpin(){
//        System.out.println("Enter your PIN : ");
//        Scanner sc = new Scanner(System.in);
//        int entpin = sc.nextInt();
//
//        if (entpin == pin){
//            menu();
//
//        }
//        else {
//            System.out.println("Enter a valid PIN.");
////            menu();
//            Checkpin();
//        }
////        menu();

//
//    }
    public void menu(){
        System.out.println("Enter your choise : ");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposite");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt == 1){
            checkbal();
        } else if (opt == 2) {
            withdraw();
        } else if (opt == 3) {
            deposite();
        } else if (opt == 4) {
            return;
        }else {
            System.out.println("Invalid Input! ");
        }
//        menu();
    }
    public void checkbal(){
        System.out.println("Balance : "+balance);
        menu();
    }
    public void withdraw(){
        System.out.println("Enter Amount : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextInt();
        if (amount > balance ){
            System.out.println("Insufficient Balance !");
        }else {
            balance = balance - amount;
            System.out.println("Money Withdrawed successfully!");
        }
        menu();
    }
    public void deposite(){
        System.out.println("Enter Amount : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextInt();
        balance = balance + amount;
        System.out.println("Money Deposited successfully!");
        menu();
    }
}
public class ATMachine {
    public static void main(String[] args) {
        
        Atm obj = new Atm();
    }
}
