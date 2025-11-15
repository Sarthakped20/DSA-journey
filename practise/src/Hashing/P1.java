package Hashing;

import java.util.*;

public class P1 {
    public static void main(String[] args) {
        int []arr = {2,3,4,1,4,5};
        System.out.println(dupli(arr));
        freq(arr);
    }

    static boolean dupli(int [] arr){
        Set<Integer> list=new HashSet<>();
        for(int num : arr){
            if (list.contains(num)){
                return false;
            }else {
                list.add(num);
            }

        }
        return true;

    }
    static void freq(int [] arr){

        Map<Integer,Integer>list = new HashMap<>();
        for (int num : arr){
            list.put(num, list.getOrDefault(num,0)+1);
        }
        int maxcount =0;
        int ele = -1;
        int ans = -1 ;
        for (Map.Entry<Integer,Integer>entry : list.entrySet()){
            if (entry.getValue()>maxcount){
                maxcount = entry.getValue();
                ans = entry.getValue();
                ele = entry.getKey();
            }
        }
        System.out.println(list);
    }

}
