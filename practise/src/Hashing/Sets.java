package Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        int [] arr = {1,2,3,2,1,4,5};
        System.out.println("Check Duplicate : "+containsduplicate(arr));
        System.out.println("Count unique: "+countDistinct(arr));
        String str = "abcsdfesas";
        System.out.println("Unique elements from String: "+removeDuplicate(str));
        System.out.println("First repeating in array: "+ firstrepeating(arr));
    }

    static boolean containsduplicate(int [] arr){
        HashSet<Integer>set = new HashSet<>();
        for (int num : arr){
            if (set.contains(num))return true;
            set.add(num);
        }return false;

    }

    static int countDistinct(int [] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.contains(num)){
                set.add(num);
            }
        }
        return set.size();
    }

    static String removeDuplicate(String str){
        Set<Character> set = new HashSet<>();
        Set<Character>duplicate = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (set.contains(ch))duplicate.add(ch);
            set.add(ch);
        }
        return Arrays.toString(set.toArray());
    }

    static int firstrepeating(int [] nums){
        HashSet<Integer>set = new HashSet<>();
        for (int num : nums){
            if (set.contains(num))return num;
            set.add(num);
        }
        return -1;
    }
}
