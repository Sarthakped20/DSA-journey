package Hashing;

import java.util.*;

public class P1 {
    public static void main(String[] args) {
//        int []arr = {2,3,4,1,4,5};
        int[] arr = {1, 2, 3, 2, 5, 1, 2};
        System.out.println(dupli(arr));
        freq(arr);
        freqq(arr);
        dupliele(arr);
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

    static void freqq(int [] nums){
        int maxcount =0;
        int element = -1;

        for (int i =0;i<nums.length;i++){
            int count =0;

            for (int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if (count>maxcount){
                maxcount = count;
                element = nums[i];
            }
        }
        System.out.println(element+"->"+maxcount);
    }


    static void dupliele(int[]arr){
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer>dupli = new HashSet<>();

        for (int num : arr){
            if (seen.contains(num)){
                dupli.add(num);
            }else {
                seen.add(num);
            }
        }
        System.out.println("Duplicate Elements: "+dupli);
    }

}
