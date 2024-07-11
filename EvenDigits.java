package com.sarthak;

import org.w3c.dom.ls.LSOutput;

public class EvenDigits {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        System.out.println(noofdigits(nums));
    }
    static int noofdigits(int [] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberofno =digits(num);
        return numberofno % 2 == 0;
    }
    
    static int digits(int num){
        int count = 0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
