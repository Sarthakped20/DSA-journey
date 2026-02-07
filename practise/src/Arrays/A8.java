package Arrays;

import java.util.Arrays;

public class A8 {
    public static void main(String[] args) {
        int [] arr = { 0,0,0,0,1,2,3,1,1,2};
        allzeros(arr);
        System.out.println(Arrays.toString(arr));
        int [] nums = {1,2,0,2,0};
        moveallf(nums);
        System.out.println(Arrays.toString(nums));
        int [] num2 = {1,2,3,4,6,7,8};
        System.out.println(missing(num2));
    }
    static void allzeros(int []arr){
        int j =0;
        for(int i =0;i<arr.length;i++){
            if (arr[i]!=0){
                arr[j] = arr[i];
                j++;
            }
        }
        while (j< arr.length){
            arr[j]=0;
            j++;
        }
    }

    static void moveallf(int []arr){
        int j=0;
//        adding all zeros at the starting
        for (int i =0;i<arr.length;i++){
            if (arr[i]==0){
                arr[j]=arr[i];
                j++;
            }
        }

        for ( int i =0;i<arr.length;i++){
            if (arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
    }

    static int missing(int [] nums){
        int n = nums.length;
        int expected = n*(n+1)/2;
        int actual =0;

        for (int num : nums){
            actual += num;
        }
        return expected - actual;
    }
}
