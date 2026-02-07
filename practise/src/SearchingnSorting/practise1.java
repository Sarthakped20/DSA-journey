package SearchingnSorting;

import java.util.Arrays;

public class practise1 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 1, 4};
        int[] arr2 = {5, 3, 8, 2, 1, 4};
        int[] arr3 = {5, 3, 8, 2, 1, 4};
        int[] arr4 = {5, 3, 8, 2, 1, 4};
        int[] ans = mergesort(arr);
        System.out.println("Merge Sort: "+Arrays.toString(ans));
        quickSort(arr2,0, arr.length-1);
        System.out.println("Quick Sort: "+Arrays.toString(arr2));
        bubsort(arr3);
        System.out.println("Bubble Sort: "+Arrays.toString(arr3));
        selection(arr4);
        System.out.println("Selection sort: "+Arrays.toString(arr4));
    }

    static int [] mergesort(int [] arr){
        if (arr.length ==1)return arr;
        int mid = arr.length/2;

        int [] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int [] merge(int [] first,int [] second){
        int [] merged = new int[first.length+ second.length];
        int i =0;
        int j = 0;
        int k = 0;
        while (i< first.length && j< second.length){
            if (first[i]<second[j]){
                merged[k]= first[i];
                i++;
                k++;
            }else{
                merged[k]=second[j];
                j++;
                k++;
            }
        }
        while (i< first.length){
            merged[k]=first[i];
            i++;
            k++;
        }
        while (j< second.length){
            merged[k]=second[j];
            j++;
            k++;
        }
        return merged;
    }


    static void quickSort(int [] arr,int low , int high){
        if (low >= high)return ;


        int s = low;
        int e = high;
        int m = low+(high-low)/2;
        int p = arr[m];


        while (s<=e){
            while (arr[s]<p){
                s++;
            }

            while (arr[e]>p){
                e--;
            }
            if (s<=e){
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }

        }
        quickSort(arr,low,e);
        quickSort(arr,s,high);
    }

    static void bubsort(int [] arr){
        boolean swapped;

        for (int i =0 ; i< arr.length;i++){
            swapped = false;

            for (int j=1; j< arr.length-i;j++){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    static void selection (int [] arr ){
        for (int i = 0; i< arr.length;i++){
            int last = arr.length-i-1;// main logic
            int max = getmax(arr,0,last);
            swap(arr,max,last);
        }


    }

    private static int getmax(int[] arr, int s, int e) {
        int max = s;
        for (int i =s;i<e;i++){
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap (int [] arr , int f , int s ){
        if (arr[f]>arr[s]){
            int temp = arr[f];
            arr[f]=arr[s];
            arr[s]=temp;
        }
    }
}
