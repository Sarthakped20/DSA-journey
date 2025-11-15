package Arrays;

import java.util.Arrays;

public class A5 {
    public static void main(String[] args) {
        int [] arr={0,0,0,0,1230,3,34,1,345,65,79};
        move0(arr);
        System.out.println(Arrays.toString(arr));
        int [] arr2 = {1,2,3,4,5,6,7};
        int k = 7;
        rotate(arr2,k);
        System.out.println(Arrays.toString(arr2));
    }

    static void move0(int [] arr){
        int j =0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }

    static void rotate(int[]arr,int k){
        k = k % arr.length;
        rev(arr,0, arr.length-1);
        rev(arr,0,k-1);
        rev(arr,k, arr.length-1);

    }
    static void rev (int [] arr,int start , int end){
        while (start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
    }
}
