package Sliding_Window;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class p1 {
    public static void main(String[] args) {
        int [] arr = {12, -1, -7, 8, -15, 30};
        int k = 3;
        fneg(arr,k);
    }

    static void fneg(int [] arr,int k){
//        ArrayList<Integer>list = new ArrayList<>();
        Queue<Integer> list = new LinkedList<>();
        int l =0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]<0){
                list.add(arr[i]);
            }

            if (i-l+1==k){
                if (list.isEmpty()){
                    continue;
                }else {
                    System.out.print(list.peek()+" ");
                }

                if (!list.isEmpty() && arr[l]==list.peek()){
                    list.poll();
                }
                l++;
            }

        }

    }
}
