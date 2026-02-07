package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class A6 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int [] nums ={1, 2, -3, 4, 5};
        int [] cus = {-1,2,4,-3,2,5};
        int [] arr3 = {2,5,7,8,1,4};
        System.out.println("Two sum: "+ Arrays.toString(twosum(arr3,9)));
        ArrayList<Integer> lists = twsm(arr3,9);
        System.out.println("Two sum new version: "+lists);
        System.out.println("custom input test: "+ ka(cus));
        System.out.println("custom input test: "+ kadane(cus));

        System.out.println(ka(arr));
        System.out.println(ka(nums));
        int[] arr4 = {4, -1, 2, 1, -5, 4};
        System.out.println(ka(arr4));
        System.out.println(maxSum(nums,3));
    }

    static int ka(int [] arr){
        int current = 0;
        int maxxsum = arr[0];

        for (int num : arr){
            current += num;
        }

        if (current>maxxsum){
            maxxsum = current;
        }
        if (current<0){
            current=0;
        }
        return maxxsum;
    }

    static int kadane(int [] nums){
        int maxsum = nums[0];
        int current = nums[0];

        for (int i =0 ; i<nums.length;i++){
            current = Math.max(nums[i],current+nums[i]);
            maxsum = Math.max(maxsum,current);
        }
        return maxsum;
    }

    static int maxSum(int [] nums , int k){
        int windowsum =0;
        int maxsum = 0;

        for (int i =0;i<k;i++){
            windowsum += nums[i];
        }
        maxsum = windowsum;

        for (int i =k;i< nums.length;i++){
            windowsum += nums[i]-nums[i-k];
            if (windowsum>maxsum){
                maxsum = windowsum;
            }
        }
        return maxsum;
    }

    static int [] twosum (int[] arr5,int t){
        for (int i=0;i<arr5.length;i++){
            for (int j =i+1;j<arr5.length;j++){
                if (t==arr5[i]+arr5[j]){
                    return new int [] {i,j};
                }
            }
        }return new int[]{};
    }
    static ArrayList<Integer> twsm(int[]arr,int t){
        ArrayList<Integer>list = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            for (int j =i+1;j<arr.length;j++){
                if (t==arr[i]+arr[j]){
                    list.add(i);
                    list.add(j);
//                    return list;
                }
            }
        }return list;

    }
}
