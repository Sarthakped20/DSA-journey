package Recursion;

import java.util.ArrayList;

public class recarr3 {
    public static void main(String[] args) {
        int [] arr = {1,23,4,3,4,2,35,33};
        System.out.println(freq(arr,3,0,0));
    }
    static int freq(int [] arr, int target , int index , int count){
        if (index == arr.length){
            return count;
        }
        if (arr[index]==target){
            count++;
//            return count;
        }
        return freq(arr,target,index+1,count);
    }
}
