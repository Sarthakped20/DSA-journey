package OOPS;

class Stud{
    private String name;
    private int age;
    private int roll;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getRoll(){
        return roll;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setRoll(int roll){
        this.roll = roll;
    }
}

public class enc {

    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.setName("Sarthak");
        s1.setAge(22);
        s1.setRoll(36);
        System.out.println(s1.getName());
        System.out.println(s1.getRoll());
        System.out.println(s1.getAge());


        BankAccount a1 = new BankAccount();
        a1.setBalance(-1000);
        System.out.println(a1.getBalance());

    }
}


class BankAccount {
    private double balance;

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        if (balance<0){
            this.balance=0;
        }
        else {
            this.balance=balance;
        }


    }



}
