package normalprac;

import java.util.Scanner;

public class s22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input : ");
//        taking input as string
//        String input = sc.nextLine();
//        String [] parts = input.split(" ");
//        int f = Integer.parseInt(parts[0]);
//        int s = Integer.parseInt(parts[1]);
//        System.out.println(f+ " " + s);
//        maximiz(f,s);
        String ip = sc.nextLine();
        String [] words = ip.split(" ");
        String inti = words[words.length-1];
        int tempe = Integer.parseInt(inti);
        temp(tempe);

    }
    static void maximiz (int f,int s){
        int max = Integer.MIN_VALUE;
        String operator = " ";
        if (f+s>max){
            max = f+s;
            operator = "+";
        }if (f-s>max) {
            max = f - s;
            operator = "-";
        }if (f*s>max) {
            max = f*s;
            operator = "*";
        }if (s!=0 && f/s>max) {
            max = f/s;
            operator = "/";
        }
        System.out.println("best operator is : " +operator);
    }
    static void temp (int tempe){
        if (tempe < 10 && tempe>0 ){
            System.out.println(" its cold !");
        } else if ( 10<=  tempe || tempe<=  20 ) {
            System.out.println("its a sunny day !");
        } else  {
            System.out.println("its hot !");
        }
    }
}
