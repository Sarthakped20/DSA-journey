package normalprac;

public class p6 {
    public static void main(String[] args) {
        printn(5);
        System.out.println();
        System.out.println(sumn(5));
        System.out.println(prd(3));
        System.out.println(fibo(5));
        System.out.println("reverse: "+rev(1234,0));
        System.out.println("Sum of digit: "+sumod(1234,0));
    }
    static void printn(int n){
        if (n<1){
            return ;
        }

        printn(n-1);
        System.out.print(n+" ");

    }
    static int sumn(int n){
        if (n==0){
            return n;
        }
        return n+sumn(n-1);
    }
    static int prd(int n){
        if (n==1){
            return n;
        }
        return n*prd(n-1);
    }
    static int fibo(int n){
        if(n<2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    static int rev(int n , int rev){
        if (n==0){
            return rev;
        }
        return rev(n/10,rev*10+n%10);
    }

    static int sumod(int n , int sum){
        if (n==0){
            return sum;
        }
        return sumod(n/10,sum+(n%10));
    }
}
