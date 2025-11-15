package normalprac;

import java.util.Arrays;

public class insert {
    public static void main(String[] args) {
        int [] arr = {1,-23,4,5,6};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insert (int [] arr){
        for (int i =0;i< arr.length-1;i++){
            for (int j = i+1;j>0;j--){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    static void quick(int [] arr){
        
    }
}
