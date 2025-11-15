package Heap;

import java.util.PriorityQueue;

public class Advheap {
    public static void main(String[] args) {
        int [] nums = {4, 3, 2, 6};
        System.out.println(tcost(nums));
    }

    static int tcost(int [] nums){
        int totalcost = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
        }
        while (minHeap.size()>1){
            int first = minHeap.poll();
            int second = minHeap.poll();
            int cost=first+second;
            totalcost += cost;
            minHeap.add(cost);
        }
        return totalcost;
    }
}
