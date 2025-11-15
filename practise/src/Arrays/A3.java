package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class A3 {
    public static void main(String[] args) {
     int [] arr = {1,3,5,7,9,23,44,123,2131,32334,212};
     int [] ars = {2,4,6,8,10,34,221,4321};
     int [] merged = mergeArr(arr,ars);
        System.out.println(Arrays.toString(merged));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int [] mergeArr(int[]arr,int[]ars){
        int n1 = arr.length;
        int n2 = ars.length;
        int [] res = new int[n1+n2];
        int i =0;
        int j = 0;
        int k =0;
            while(i<n1 &&  j<n2){
                if (arr[i]<=ars[j]){
                    res[k++]=arr[i++];
                }else if (ars[j]<=arr[i]){
                    res[k++]=ars[j++];
                }
            }
            while (i<n1){
                res[k++]=arr[i++];
            }
            while (j<n2){
                res[k++]=ars[j++];
            }
        return res;
    }
}
