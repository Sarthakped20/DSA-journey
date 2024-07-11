package com.sorting;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,2};
        bubbble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbble(int[]arr){

        boolean swapped ;

        for (int i=0;i<arr.length;i++){
            swapped = false;
//  for comparing the first value with the elements in the array
            for (int j=1;j<arr.length-i;j++){
// to check whether the next element is greater then the current element
                if (arr[j] < arr[j-1] ){
//                    swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }

}

