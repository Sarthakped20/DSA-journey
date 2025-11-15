package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class A4 {
    public static void main(String[] args) {
        int []arr= {0,1,2,3,4,5,6,7,9};
        int[] arr1 = {3, 0, 2};
        System.out.println(retno(arr));
        System.out.println(retno(arr1));
        System.out.println("Missing number: " + findMissingNumber(arr1));
    }

    static int retno(int [] arr){
        int n = arr.length;
        int expectedsum = n * (n+1) / 2;
        int actualsum = 0;

        for (int i =0;i<arr.length;i++){
            actualsum += arr[i];
        }
//        for (int num : arr){
//            actualsum += num;
//        }
        return expectedsum - actualsum;
    }

    public static int findMissingNumber(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i)
                return i;
        }
        return arr.length;
    }



}
