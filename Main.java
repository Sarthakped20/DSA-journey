package com.stringsinJava;

public class Main {
    public static void main(String[] args) {
        String a= "Sarthak";
        String b="Sarthak";
//  it shows that the diff var are pointing at same object
        System.out.println(a==b);


        String name1= new String("Sarthak");
        String name2= new String("Sarthak");
// this shows that both the var are pointing at different objects
        System.out.println(name1==name2);

        System.out.println(name1.equals(name2));
//  this .equals method is used to just compare the values of different objects
        String series ="";
        for (int i=0;i<26;i++){
            char ch = (char)('a'+i );
            System.out.println(ch);
        }


    }
}
