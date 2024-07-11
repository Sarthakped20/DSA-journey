package com.binarysearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,45,65,75,78,82,85,96,99,102,130,150,170};
        int target = 85;
        System.out.println(ans(arr, target));

    }
    static int ans(int [] arr ,int target){
        int start = 0;
        int end = 1;

        while (target > end){
            int newStart = end + 1;
//            end  = previous end + size of box *2
            end = end + (end - start) *2 ;
            start = newStart;
        }
        return binarySearch(arr , target ,start ,end);
    }

    static  int binarySearch (int[] arr, int target,int start , int end){

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
