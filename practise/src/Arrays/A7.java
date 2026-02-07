package Arrays;

import java.util.Arrays;

public class A7 {
    public static void main(String[] args) {
        int [] arr = {1,1,3,4,2,2,2,0,0,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int []arr){
        for (int i = 0;i<arr.length;i++){
            for (int j =1 ;j <arr.length;j++){
                if (arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }

        }
    }
}
