package OOPS;
class Dog{
    int licenceid;
    String name ;

    public void eats(){
        System.out.println(name+" eats!");
    }
}

public class Oops2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Arrow";
        System.out.println(dog1.name);
        dog1.eats();
    }
}
