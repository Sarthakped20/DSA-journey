package com.Arrays;

import java.util.Arrays;

public class eg7 {
    public static void main(String[] args) {
        int [] arr = {2,4,5,23,67,77,8};
        swap(arr,2,5);
//        if i just print the arr it will give me a hashvalue
//        System.out.println(arr);
//        to get the swaped value we use Array.toString
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
