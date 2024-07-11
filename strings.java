package com.stringsinJava;

import java.sql.SQLOutput;
import java.util.Arrays;

public class strings {
    public static void main(String[] args) {
        String name="Sarthak pednekar";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.split(" ")));
//        System.out.println(Arrays.toString(name.indexOf('a')));
    }
}
