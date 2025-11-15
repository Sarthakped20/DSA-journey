package Arrays;

import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.Collection;

public class A1 {
    public static void main(String[] args) {
        int [] arr = {-2,-344,-23,-1243,-10};
        System.out.println(maxe(arr));
        System.out.println(mine(arr));
        System.out.println("different approach");
        minmax(arr,1);
    }

    static int maxe(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i =0;i< arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static int mine(int [] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        return min;
    }
    static void minmax(int [] arr,int k){


        Arrays.sort(arr);
        int n = arr.length;
//        int maxi = Integer.MIN_VALUE;
//        int mini = Integer.MAX_VALUE;

        if (k>0 && k<=n){
            int kmin = arr[k-1];
            int kmax = arr[n-k];
            System.out.println(kmax);
            System.out.println(kmin);
        }
        else {
            System.out.println("invalid k");
        }
    }
}
