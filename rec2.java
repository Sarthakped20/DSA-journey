package com.recurSion;

public class rec2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,56,78,9};
//        int target = 78;
        System.out.println(search(arr,9,0));
    }
    static boolean search(int []arr,int target,int index){
//        if element not found
        if (index== arr.length){
            return false;
        }
//        searching in the array 
        return arr[index]==target || search(arr,target,index+1);
    }
}
