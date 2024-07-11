package com.sarthak;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int target = 45;

        int [][]arr={
                {23,45,8},
                {33,17,89,65,11},
                {45,56,77,9}
        };
        int[] ans= Search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);

    }
    static int[] Search(int[][]arr,int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return new int[]{row, column};
                }
            }
        }
        return new int[]{-1, -1};
    }
    static int max ( int[][] arr){
            int max = Integer.MIN_VALUE;
            for (int[] ints : arr) {
                for (int elements : ints) {
                    if (elements > max) {
                        max = elements;
                    }
                }
            }
            return max;
        }




}
