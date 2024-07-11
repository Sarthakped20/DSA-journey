package com.sorting;

import java.util.Arrays;

public class bubbleLeet {
    public static void main(String[] args) {
        String [] names ={"Marry","John","Emma"};
        int [] heights = {180,165,170};
        sortPeople(names,heights);
        System.out.println(Arrays.toString(heights));
    }

    static void sortPeople(String[] names,int [] heights){
        for (int i = 0;i< heights.length;i++){
            for (int j = 1;j< heights.length-i;j++){
                if (heights[j]<heights[j-1]){
                    int temp = heights[j];
                    heights[j] = heights[j-1];
                    heights[j-1] = temp;
                }
            }
        }
    }
}
