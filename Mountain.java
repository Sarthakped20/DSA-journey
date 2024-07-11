package com.binarysearch;

public class Mountain {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1 ;
        while (start < end){
            int mid = start + (end - start) / 2;
            if ( arr[mid] > arr[mid+1]){
// this indicates that we are in the des part of the arr and > elements may lie on left side
// or it may be the possible ans
                end = mid ;
            }else {
// this says that there may be > values on right side and we are in asc part of arr
                start = mid + 1;
            }
        }return start;
//        because both are pointing the the same index
    }
}
