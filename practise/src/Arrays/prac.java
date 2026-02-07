package Arrays;

import java.util.Arrays;

public class prac {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,6,7,8};
        int [] nums2 = {1,2,3,4,6,7,8};
        int n = nums.length+1;
        System.out.println(missing(nums,n));
        rotateR(nums,3);
        System.out.println("Right rotate: "+Arrays.toString(nums));
        rotateL(nums2,3);
        System.out.println("Left Rotate: "+Arrays.toString(nums2));
        int [] arr = {1,2,3,4,5,6};
        System.out.println("Unique Count: "+countu(arr));
        int[] arr2 = {2, 7, 11, 15};
        int [] result = twoSum(arr2,4);
        System.out.println("Two Sum problem: "+result[0]+" "+result[1]);
    }
    static int missing(int [] nums,int n ){
//        int n = nums.length;
        int expected = n*(n+1)/2;
        int actual =0;

        for (int num : nums){
            actual += num;
        }
        return expected - actual;
    }
    static void rotateR(int [] arr , int k){
        int n = arr.length;
        k = k % n;
        rev(arr,0,n-1);
        rev(arr,0,k-1);
        rev(arr,k,n-1);
    }

    static void rev(int[]arr,int s ,int e){
        while (s<=e){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    static void rotateL(int[]arr,int k){
        int n = arr.length;
        k = k % n;

        rev(arr,0,k-1);
        rev(arr,k,n-1);
        rev(arr,0,n-1);
    }

    static int countu(int [] nums){
        int i =0;
        for (int j =1;j<nums.length;j++){
            if (nums[j]!=nums[i]){
                i++; // i chi value increase kartoi;
                nums[i]=nums[j];
            }
        }return i+1;
    }

    static int [] twoSum(int [] arr, int target){
        for (int i =0;i<arr.length;i++){
            for (int j=1;j<arr.length;j++){
                if (arr[i]+arr[j]==target){
                    return new int []{i,j};
                }
            }
        }return new int[]{-1,-1};
    }
}
