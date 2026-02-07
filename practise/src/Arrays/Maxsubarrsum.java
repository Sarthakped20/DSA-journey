package Arrays;

import java.util.ArrayList;

public class Maxsubarrsum {
    public static void main(String[] args) {
        int [] nums = {1,2,-1,3,4,-4,-2,5,6};
        int []arr={2, 3, 5, 1, 6};
        System.out.println(maxsum(arr,2));
        System.out.println(nagesh(nums,3));

    }


    static int maxsum(int [] arr , int k){
        int l = 0;
        int max = 0;
        int sum = 0;


        for (int r =0;r<arr.length;r++){
            sum += arr[r];

            if (r-l+1 == k){
                max = Math.max(max,sum);
                sum -= arr[l];
                l++;

            }
        }

        return max;
    }

    static ArrayList nagesh(int [] arr, int k){
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<Integer>res = new ArrayList<>();
        int l = 0;

        for (int r = 0; r<arr.length;r++){

            if (arr[r]<0){
                list.add(arr[r]);
            }


            if (r-l+1 == k){
                if (list.isEmpty()){
                    res.add(0);
                }else {
                    res.add(list.get(0));
                }
                if (!list.isEmpty() && arr[l] == list.get(0)) {
                    list.remove(0);
                }
                l++;
            }
        }
        return res;
    }
}
