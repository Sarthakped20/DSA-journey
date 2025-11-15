package Hashing;

import java.util.HashSet;
import java.util.Set;

public class H2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,2,1,1,1,3,4,5};
//        System.out.println(count(arr));
        String str = "sarthak ki GT kal aayegi ! sarthak ki !";
        System.out.println(Ccount(str));
        System.out.println(Scount(str));
    }

//    Count and return dulpicate values
    static int count (int []arr){
        Set<Integer>seen= new HashSet<>();
        Set<Integer>dup = new HashSet<>();

        for(int num : arr){
            if(!seen.add(num)){
                dup.add(num);
            }
        }
        System.out.println(dup);
        return dup.size();
    }

//    count andd return dup char

    static int Ccount(String str){

        char [] ch = str.toCharArray();

        Set<Character> seen = new HashSet<>();
        Set<Character>dup = new HashSet<>();

        for (char c:ch) {
            if (c==' ') continue;
            if (!seen.add(c)){
                dup.add(c);
            }
        }
        System.out.println(dup);
        return dup.size();

    }
// count and return dup words
    static int Scount(String str){
        String [] words = str.split(" ");
        Set<String>seen=new HashSet<>();
        Set<String>dup = new HashSet<>();

        for (String word :words) {
            if (word == " ")continue;
            if (!seen.add(word)){
                dup.add(word);
            }
        }
        System.out.println(dup);
        return dup.size();
    }
}
