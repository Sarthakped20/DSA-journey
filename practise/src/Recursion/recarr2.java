package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class recarr2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,50,6,8,6,4};
        System.out.println(maxi(arr,0));
        int [] aray = {9,8,7,6,5,4,3,2};
        revar(aray,0,aray.length-1);
        System.out.println(Arrays.toString(aray));
        int [] result = count(arr,0,0,0);
        System.out.println("Even: "+result[0]+" Odd: "+result[1]);
    }
    static int maxi (int [] arr , int index){
        if (index == arr.length-1){
            return index;
        }
        for (int i =0;i< arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                return arr[i];
            }
        }
        return maxi(arr, index+1);
    }

    static void revar(int [] aray , int l , int r){
        if (l>r){
            return;
        }
        int temp = aray[l];
        aray[l]=aray[r];
        aray[r]=temp;
        revar(aray,l+1,r-1);
    }

    static int[] count (int [] arr,int index,int even , int odd){
        if (index == arr.length-1){
            return new int[]{even,odd};
        }
        if (arr[index]%2==0){
            even++;
        }else {
            odd++;
        }

        return count(arr,index+1,even,odd);
    }
}
