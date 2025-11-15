package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class H1 {
    public static void main(String[] args) {
        int [] arr = { 1,23,3,45,545,5643,434,544};
        int k =3;
        System.out.println(fkl(arr,k));
        System.out.println(" : ");
        System.out.println(fkse(arr,k));
        System.out.println("Smaallest : "+ small(arr,k));
    }

    static int fkl(int[]arr,int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr){
            maxHeap.add(num);
        }
        System.out.println(maxHeap);
        for (int i=1;i<k;i++){
            maxHeap.poll();
        }
        return maxHeap.peek();

    }

    static int fkse(int [] arr,int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr){
            maxHeap.add(num);
            if (maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        return maxHeap.peek();
    }

    static int small(int []arr,int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.add(num);
        }

        return minHeap.peek();
    }
}
