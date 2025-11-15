package Recursion;

public class RP1 {
    public static void main(String[] args) {
        int n = 9;
        int f = 5;
        printnto1(n);
        print1ton(1,n);
        System.out.println();
        System.out.println(fact(f));
        System.out.println(factser(f));
        System.out.println("Sum of N: "+sumN(3));
        System.out.println("Product of N: "+prodN(5));
        System.out.println("Count of Digits: "+countd(2341));

    }

    static int printnto1(int n){
        if (n<1){
            System.out.println("0.");
            return 0;
        }
        System.out.print(n + ", ");
        return printnto1(n-1);
    }

    static int print1ton(int n , int tar ){
        if (n>tar){
//            System.out.println(tar+".");
            return -1;
        }
        System.out.print(n+" ");
        return print1ton(n+1,tar);
    }

    static int fact(int n){
        if (n<2){
            return 1;
        }
        return n*fact(n-1);
    }

    static int factser(int n ){
        if (n<2){
            return 1;
        }
        return n*factser(n-1);
    }

    static int sumN(int n){
        if (n==0){
            return 0;
        }
        return n+sumN(n-1);
    }
    static int prodN(int n){
        if (n < 1){
            return 1;
        }
        return n*prodN(n-1);
    }
    static int countd(int n){
        if (n==0){
            return 0;
        }
        return 1+countd(n/10);
    }

}
