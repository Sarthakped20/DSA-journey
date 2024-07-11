package com.binarysearch;

public class findInMountain {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,3,2,1};
        int target = 3;
//        int ans = sear(arr,target);

    }

    int Search(int []arr,int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        else {
            return binarySearch(arr, target,peak+1,arr.length-1);
        }


    }

    public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
// this indicates that we are in the des part of the arr and > elements may lie on left side
// or it may be the possible ans
                end = mid;
            } else {
// this says that there may be > values on right side and we are in asc part of arr
                start = mid + 1;
            }
        }
        return start;
    }
    static  int binarySearch (int[] arr, int target,int start,int end){
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end - start) / 2; //a better formula then mid = start + end / 2//
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }else {
                if (target <  arr[mid]){
                    start = mid +1;
                }else if(target > arr[mid]){
                    end = mid -1;
                }else {
                    return mid;
                }
            }
        }
        return -1  ;

    }
}

