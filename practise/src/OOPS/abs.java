package OOPS;



abstract class Animal {
    public abstract void sound();
    public void sleep(){
        System.out.println("sleeping");
    }


}
class Doog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }

}
public class abs {
    public static void main(String[] args) {
        Doog dog = new Doog();
        dog.sound();
        dog.sleep();

        Cat cat = new Cat();
        cat.makesound();
        cat.eat();

        Cow cow = new Cow();
        cow.makesound();
        cow.eat();

        Online p1 = new Online();
        p1.makePayment();

//        Card p2 = new Card();
//        p2.makePayment();
    }
}


abstract class Animalk{
    public abstract void makesound();
    public void eat(){
        System.out.println("Is Eating....");
    }
}

class Cat extends Animalk{
    public void makesound(){
        System.out.println("meow");
    }
}
class Cow extends Animalk{
    public void makesound(){
        System.out.println("Moos");
    }
}


abstract class Payment{
    public abstract void makePayment();
}

class Online extends Payment{
    @Override
    public void makePayment() {
        System.out.println("Ye online payment method hai");
    }
}
class Card extends Payment{
    @Override
    public void makePayment() {
        System.out.println("This is card Payment");
    }
}
