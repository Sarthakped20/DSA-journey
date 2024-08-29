package com.recurSion;

public class rec1 {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,7,8};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int [] arr, int index){
//        if only single element
        if (index == arr.length-1){
            return true;
        }
//        checking the array is sorted or not
        return arr[index]< arr[index+1] && sorted(arr, index+1);
    }
}
