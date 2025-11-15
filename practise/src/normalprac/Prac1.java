package normalprac;

import java.util.Arrays;

public class Prac1 {
    /*public static void main(String[] args) {
        int [] array = {1,42,34,67,42,12,39,74,12};
        int ans = findSecondHighest(array);
        System.out.println(ans);
    }
    private static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }

        }
        return secondHighest;
    }*/

    public static void main(String[] args) {
        int arr[] = {21,34,55,78,987,34,999};
//        int[] arr ={2,34,54,65,77,87,97};
        System.out.println(sorted(arr));
        System.out.println(Arrays.toString(arr));
    }
//    find an element in array
    static int find(int [] arr){
        int x = 34;
        for (int i = 0;i< arr.length;i++){
            if (x == arr[i]){
                return i;
            }
        }return -1;
    }
//    find max element in array
    static int maxi(int[] arr){
        int maxi = 0;
        for (int i =0;i< arr.length;i++){
            if (maxi<arr[i]){
                maxi=arr[i];
            }
        }return maxi;
    }
//    find second max element in array
    static int secmax(int [] arr){
        int max = 0;
        int secmax = 0;
        for (int i = 0;i< arr.length;i++){
            if (max<arr[i]){
                secmax = max;
                max = arr[i];
            } else if (arr[i]>secmax) {
                secmax = arr[i];

            }
        }return secmax;
    }

//    find avg of all elements in array
    static int avg(int[] arr){
        int avg = 0;
        for (int i : arr) {
            avg = (avg + i)/ arr.length;
        }return avg;
    }
    static void rev(int [] arr){
        int r = arr.length-1;
        int l = 0;
        while(l<r){
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    static boolean sorted(int[]arr){
        for (int i =0;i< arr.length-1;i++){
            if (arr[i+1]<arr[i]){
                return false;
            }
        }return true;
    }
}