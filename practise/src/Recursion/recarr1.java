package Recursion;

import java.util.ArrayList;

public class recarr1 {
    public static void main(String[] args) {
        int[]arr = {1,2,3,9,4,5,9,7,8};
        int target = 9;
        System.out.println(sorted(arr,0));
        System.out.println(search(arr,target,0));
        System.out.println(findall(arr,target,0,new ArrayList<>()));
    }
    static boolean sorted(int[]arr , int index){
        if (index == arr.length-1){
            return true;
        }
        return arr[index]< arr[index+1] && sorted(arr,index+1);
    }

    static int search(int [] arr ,int target , int index){
        if (index == arr.length-1){
            return -1;
        }
        if (arr[index]==target){
            return target;
        }

        return search(arr, target, index+1);
    }
    static ArrayList findall(int [] arr , int target , int index , ArrayList<Integer>list){
        if (index == arr.length-1){
            return list;
        }
        if (arr[index]== target){
            list.add(index);
        }
        return findall(arr, target, index+1, list);
    }
}
