package SearchingnSorting;

import java.util.Arrays;

public class MergeSort {


    static int[] mergesort(int[]arr){
        if (arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int [] left = mergesort(Arrays.copyOfRange(arr,0 , mid));
        int [] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int [] merge(int[]l,int[]r){
        int i = 0;
        int j = 0;
        int k = 0;
        int [] mix = new int[l.length+ r.length];

        while (i<l.length && j<r.length){
            if (l[i]<r[j]){
                mix [k]=l[i];
                i++;
            }else {
                mix[k]=r[j];
                j++;
            }
            k++;
        }
// if the length of any one array is bigger the this loop will run accordingly
        while (i<l.length){
            mix[k] = l[i];
            i++;
            k++;
        }
        while (j<r.length){
            mix[k]=r[j];
            j++;
            k++;
        }
        return mix;
    }
    public static void main(String[] args) {
        int []arr ={2,3,1,454,54,21,5,66};
//        mergesort(arr);
        System.out.println(Arrays.toString(mergesort(arr)));
    }
}
