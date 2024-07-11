package com.sarthak;
import java.util.*;
public class reverseno {
    public static void main(String[] args) {
        int n = 43526;
        int rev = 0;
        while (n > 0){
            int rem= n % 10;
            n /= 10;
            rev = rev * 10 + rem;
        }
        System.out.println(rev);
    }
}
