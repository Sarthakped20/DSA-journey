package OOPS;

public class p1 {
    public static void main(String[] args) {
        Account acc = new Account();
        System.out.println(acc.getBalance());
        acc.deposit(5000000);
        System.out.println(acc.getBalance());

        Student s1 = new Student();
        s1.setName("Sarthak");
        System.out.println("s1 name: "+s1.getName());
        s1.getRollno();
        s1.getAge();
    }
}
class Account{
    private double balance;

    public void deposit (double amount){
        if (amount>0){
            balance += amount;
        }
    }
    public double getBalance(){
        return balance;
    }



}
class Student {
    private String name;
    private int age;
    private int rollno;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getRollno(){
        return rollno;
    }
}
