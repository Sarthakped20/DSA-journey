package Recursion;

import java.util.IllegalFormatCodePointException;

public class RP2 {
    public static void main(String[] args) {
        int arr[] = {1,2,8,4,5,6,3,9};
        int [] nums = {1,2,3,4,5,6};
        System.out.println(sorted(arr,0));
        System.out.println(search(nums,0,4));
    }

    static boolean sorted(int [] arr,int index){
        if (index == arr.length-1){
            return true;
        }
        if (arr[index]>arr[index+1]){
            return false;
        }
        return sorted(arr, index+1);
    }

    static boolean search (int [] arr,int index,int target) {
        while (index < arr.length) {
            if (target == arr[index]) {
                return true;
            }
            if (target != arr[index]) {
                return false;
            }

        }return search(arr, index + 1, target);
    }

}
