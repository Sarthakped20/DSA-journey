package com.recurSion;

import java.util.ArrayList;

public class rec3 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,5,7,8};
        ArrayList<Integer> ans = findIndex(arr,3,0,new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList<Integer> findIndex(int []arr,int target,int index ,ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
         return findIndex(arr, target, index+1, list);
    }
}
