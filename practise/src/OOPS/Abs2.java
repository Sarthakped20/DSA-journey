package OOPS;


abstract class Shape{
    Shape(){
        System.out.println("Shape is created");
    }
    public abstract void draw();
}

class Circle extends Shape{
    Circle(){
        System.out.println("Cricle created");
    }
    public void draw(){
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape{
    Square(){
        System.out.println("Square created");
    }
    public void draw(){

        System.out.println("Drawing square");
    }
}
public class Abs2 {
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.draw();

        Square sq = new Square();
        sq.draw();
    }

}
