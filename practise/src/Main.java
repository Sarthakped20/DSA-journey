// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Ente
// r. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    String name;
    int rollno;
    public void printdata(){
        System.out.println(name);
        System.out.println(rollno);
    }
    public static void main(String[] args) {
        Main std1 = new Main();
        std1.name = "sarthak";
        std1.rollno = 36;
//            System.out.println(std1.name);
        std1.printdata();
        Main std2 = new Main();
        std2.name = "Vikas";
        std2.rollno = 7;
        std2.printdata();
    }

}