package Arrays;

import java.util.Arrays;

public class Dsap1 {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,2,2,1,1,1,1};
        System.out.println(majority(arr));
    }

    static int seclar(int [] arr){
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        boolean foundsec = false;
        for (int i =0;i<arr.length;i++){
            if (arr[i]>max){
                secondLargest = max;
                max=arr[i];
            } else if (arr[i]<max && arr[i]>secondLargest){
                secondLargest = arr[i];
                foundsec = true;
            }
        }if (!foundsec){
            return -1;
        }
        return secondLargest;
    }

    static int [] rotater(int [] arr,int k){
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        return arr;
    }

    static void  reverse (int [] arr , int first , int second){
        while (first<second){
            int temp = arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
            first++;
            second--;
        }
    }

    static int [] moveos(int [] arr){
        int index = 0;
        for (int i =0;i<arr.length;i++){
            if (arr[i]==0) continue;
            else {
                arr[index]=arr[i];
                index++;
            }
        }
        while (index<arr.length){
            arr[index]=0;
            index++;
        }
        return arr;
    }

    static int maxSubarr(int[]arr){
//        int n = arr.length-1;
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i =1;i<arr.length;i++){
            currentSum =Math.max(arr[i],currentSum+arr[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }

    static int majority(int [] arr){
        int count =0;
        int candidate = 0;
        for (int num : arr){
            if (count == 0){
                candidate=num;
                count =1;
            } else if (num == candidate){
                count++;
            }else {
                count--;
            }
        }
        count = 0;
        for (int num : arr) {
            if (num == candidate) count++;
        }

        return count > arr.length / 2 ? candidate : -1;
    }

    static int maxsubpro(int []arr){
        int currentprod = arr[0];
        int maxprod = Integer.MIN_VALUE;
        for (int i = 1;i<arr.length;i++){
            if (arr[i]==0){
                return 0;
            }
            currentprod *= arr[i];
            maxprod = Math.max(maxprod,currentprod);
        }
        return maxprod;
    }
}
