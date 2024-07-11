package com.binarysearch;

public class Bsii {
    public static void main(String[] args) {

    }
    static  int ceiling (int[] letters, int target){
        if (target > letters[letters.length -1]){
            return -1;
        }
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2; //a better formula then mid = start + end / 2//
            if (target < letters[mid]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
//        return end;for floor value
    }
}
