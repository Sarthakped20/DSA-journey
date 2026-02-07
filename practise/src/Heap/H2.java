package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class H2 {
    public static void main(String[] args) {
        int [] arr = {2,3,41,9,12,64,7};
        System.out.println(Kthlarg(arr,4));
        System.out.println(kthsmal(arr,1));
    }

    static int Kthlarg(int [] arr,int k){
        PriorityQueue<Integer> Maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr){
            Maxheap.add(num);
        }
        for (int i =1;i<k;i++){
            Maxheap.poll();
        }

        return Maxheap.peek();
    }
    static int kthsmal(int [] arr,int k){
        PriorityQueue<Integer> Maxheap = new PriorityQueue<>();

        for (int num : arr){
            Maxheap.add(num);
        }
        for (int i =1;i<k;i++){
            Maxheap.poll();
        }

        return Maxheap.peek();
    }
}
