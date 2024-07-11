package com.binarysearch;
//return the ceiling value i.e smallest number greater than or = target
public class Bsearchi {
    public static void main(String[] args) {
        int [] arr= {-122,-23,-11,0,1,34,55,76,88,324,667,3455};
        int target= 89;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
    static  int ceiling (int[] arr, int target){
        if (target > arr[arr.length -1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2; //a better formula then mid = start + end / 2//
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start ;//for ceiling value
//        return end;for floor value
    }

}
