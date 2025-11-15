package normalprac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        the main array
        int[]arr = {1,2,3,4,5,6,7,8};
//        size of subarrays
        int k = sc.nextInt();
//        list to store subarrays
        List<int[]>subarrays = split(arr,k);

//        printing the subarrays

        for (int [] subarray:subarrays) {
            for (int val:subarray) {
                System.out.print(val + " ");
            }
            System.out.println();

        }
    }
    static List<int[]>split(int []arr,int k){
        List<int[]>result = new ArrayList<>();
        for (int i = 0;i< arr.length;i+=k){
//            dividing the subarrays in size k or remaining elements
            int size = Math.min(k, arr.length-i);
//          creating sub arrays of the size
            int [] subarray = new int[size];
            for (int j = 0 ;j<size;j++){
                subarray[j] = arr[i+j];
            }
            result.add(subarray);
        }
        return result;
    }
}
