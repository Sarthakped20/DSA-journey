package OOPS;


interface Car{
    public void Start();
}

class electric implements Car{
    public void Start (){
        System.out.println("Electric car!");
    }
}
class desiel implements Car{
    public void Start (){
        System.out.println("Desiel car!");
    }
}
public class interf {
    public static void main(String[] args) {
//        creating object
//        interface_name obj_name = new Class_name
        Car tesla = new electric();
        Car tata = new desiel();
        tesla.Start();
        tata.Start();
    }
}
