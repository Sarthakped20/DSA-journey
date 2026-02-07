package Hashing;

import java.security.Key;
import java.util.HashMap;

public class TD1 {
    public static void main(String[] args) {
        freq("aabcdbbdss");
        fnonrepeat("aasdfdssssac");
    }
    static void freq(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }

    static void fnonrepeat(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for (char ch : str.toCharArray()){
            if (map.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }
    }

}
