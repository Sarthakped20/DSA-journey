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
