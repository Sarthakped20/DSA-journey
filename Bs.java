package com.sarthak;

public class Bs {
    public static void main(String[] args) {
        int [] arr= {1,3,4,4,4,5,6,6,7,8,9};
        int target=6;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static  int binarySearch (int[] arr, int target){
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
        return -1  ;
    }
}
