package OOPS;
import java.util.*;
  class  parentClass{
         void display(){
             System.out.println("Parent class method ");
         }
  }
  class  childClass extends parentClass{
         void show(){
             System.out.println("child Class method");
         }
  }
public class inhet1 {
    public static void main(String[] args) {
        childClass child1 = new childClass();
        child1.display();
        System.out.println();
        child1.show();

        car car1 = new car();
        car1.brand = "Tata";
        car1.ftype = "Deseil";
        car1.sunroof = false;
        car1.price = 1200000;
        car1.milage = 22.5;
        car1.color = "Black";
        car1.display();
    }
}

class vehicle {
      double price;
      double milage;
      String color;
      void display(){
          System.out.println("price: "+price);
          System.out.println("milag: "+milage);
          System.out.println("color: "+color);
      }
}
class car extends vehicle{
      String brand;
      String ftype;
      boolean sunroof;
}


