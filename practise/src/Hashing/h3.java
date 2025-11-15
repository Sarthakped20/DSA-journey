package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class h3 {
    public static void main(String[] args) {
        String str = "sarthak";
        int [] nums = {1,2,2,1,3,1,3,4,2,2};
        freqCount(str);
        freqCountint(nums);
    }
    static void freqCount(String str){
        HashMap<Character,Integer> freq = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }
        for (char c: freq.keySet()) {
            System.out.println(c+" -> "+freq.get(c)+" ");
        }
    }

    static void freqCountint(int [] nums ){
        HashMap<Integer,Integer>freq = new HashMap<>();
        for (int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        for (int num : freq.keySet()){
            System.out.println(num +" -> "+freq.get(num));
        }
    }
}
