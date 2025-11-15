package OOPS;

public class p2 {
    public static void main(String[] args) {
        System.out.println("Encapsulation: ");
        BanksAccount acc1 = new BanksAccount();
        acc1.deposite("abc123",12352);
        acc1.deposite("abc123",231);
        System.out.println(acc1.getBalance());
        acc1.withdraw("abc123",3132);
        acc1.withdraw("abc123",100000);
        System.out.println(acc1.getBalance());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("polymorphism ");
        System.out.println("Method Overloading : ");
        MethodOL m1 = new MethodOL();
        System.out.println(m1.add(1,34));
        System.out.println(m1.add(1231.1,34.5));
        System.out.println(m1.add(1,34,342));

        System.out.println("Method Over riding :  ");
        MethodOR a = new Dogg();
        a.sound();
        MethodOR b = new Chimni();
        b.sound();
        Chimni c = new Chimni();
        c.sound();
        System.out.println();
        System.out.println();
        System.out.println("Abstraction :");
        vehical c1 = new Caar();
        c1.start();
        c1.stop();

        vehical b1 = new Bike();
        b1.start();
        b1.stop();
        System.out.println();
        System.out.println();
        System.out.println("Abstraction using Interface: ");

        payment p1 = new Credit();
        payment p2 = new Upi();

        p1.pay();
        p2.pay();
    }
}
class BanksAccount {
    private String accNo;
    private double balance;

    public void deposite(String accNo,int amt){
        if (amt > 0) {
            balance += amt;
        }
    }
    public void withdraw(String accNo,int amt){
        if (amt>0 && amt <= balance){
            balance -= amt;
        }else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance(){
        return balance;
    }
}
// Polymorphism: method Over Loading and Over Riding
class MethodOL{
    int add(int a , int b){
        return a+b;
    }
    double add(double a , double b){
        return a+b;
    }
    int add(int a , int b, int c){
        return a+b+c;
    }


}
class MethodOR{
    void sound(){
        System.out.println("Makes sound");
    }
}
class Dogg extends MethodOR{
    void sound(){
        System.out.println("Barks");
    }
}
class Chimni extends MethodOR{
    void sound(){
        System.out.println("chew chew");
    }
}

abstract class vehical {
    abstract void start();
    void stop(){
        System.out.println("Break laga laude");
    }
}

class Caar extends vehical{
     void start(){
        System.out.println("Gadi button se chalu hoti hai");
    }
}

class Bike extends vehical{
    void start(){
        System.out.println("Chabi laga jhatu bike ko pehele ");
    }

}
interface payment {
    void pay();
}
class Credit implements payment {
    public void pay(){
        System.out.println("paying through card");
    }
}

class Upi implements payment{
    public void pay(){
        System.out.println("UPI kartoi");
    }
}