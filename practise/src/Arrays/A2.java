package Arrays;

import java.util.Arrays;

public class A2 {
    public static void main(String[] args) {
        int [] arr = {2,0,0,0,0,3,0,3,2,4,6};
        move(arr);
        challenge(arr);

    }


    static void move(int [] arr){
        int n = arr.length;

        for (int i =0;i< arr.length;i++){
            for (int j= i;j< arr.length;j++){
                if (arr[i]==0){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void challenge(int[]arr){
        int j=0;
        for (int i =0;i<arr.length;i++){
            if (arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
//        minmax(arr);

    }
    static void minmax(int [] arr){
        int n = arr.length-1;
        Arrays.sort(arr);
        System.out.println();
        System.out.println(arr[n]);

    }
}
