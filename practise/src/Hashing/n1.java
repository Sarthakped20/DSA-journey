package Hashing;

import java.util.HashSet;
import java.util.Map;

public class n1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] arr2 = {1,2,3,4,5,6,1};
        System.out.println(contains(arr2));
        removedup(arr);
        removedupc("abcsdsbbcsaefghhdf");
        System.out.println(containsc("sarthak"));
        frepeat("programing");
        fnonrepeat("programming");
        System.out.println(luniqsubs("sarthak"));

    }

    static void removedup(int [] arr){
        HashSet<Integer>seen = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            if (!seen.contains(arr[i])){
                seen.add(arr[i]);
            }
        }
        System.out.println(seen);
    }
    static void removedupc(String str){
        HashSet<Character>seen = new HashSet<>();
        for (int i=0;i<str.length();i++){
            if (!seen.contains(str.charAt(i))){
                seen.add(str.charAt(i));
            }
        }
        System.out.println(seen);
    }

    static boolean contains (int [] arr){
        HashSet<Integer>seen = new HashSet<>();
        for (int i =0;i< arr.length;i++){
            if (seen.contains(arr[i])){
                return true;
            }
            seen.add(arr[i]);

        }return false;
    }

    static boolean containsc (String str){
        HashSet<Character> seen = new HashSet<>();
        for (int i=0;i<str.length();i++){
            if (seen.contains(str.charAt(i))){
                return true;
            }
            seen.add(str.charAt(i));
        }
        return false;
    }

    static void frepeat(String str){
        HashSet<Character>seen = new HashSet<>();
        for (char ch : str.toCharArray()){
            if (!seen.add(ch)){
                System.out.println("First repeating: "+ch);
                break;
            }
        }
    }
    static void fnonrepeat(String str){
        HashSet<Character>seen = new HashSet<>();
        HashSet<Character>repeat = new HashSet<>();

        for ( char ch : str.toCharArray()){
            if (!seen.add(ch)){
                seen.remove(ch);
                repeat.add(ch);
            }
        }
        for (char ch : str.toCharArray()){
            if (seen.contains(ch)){
                System.out.println("First non repeating: "+ch);
                break;
            }
        }
    }

    static int luniqsubs(String str){
        HashSet<Character>seen = new HashSet<>();
        int maxlen =0;
        int l = 0;
        for (int r =0;r<str.length();r++){
            char ch = str.charAt(r);

            while (seen.contains(ch)){
                seen.remove(str.charAt(l));
                l++;
            }
            seen.add(ch);
            maxlen = Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }

}
