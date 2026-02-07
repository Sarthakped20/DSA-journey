package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class p2 {
    public static void main(String[] args) {
        String [] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(findana(str));

    }
    static List<List<String>> findana(String [] str){
        HashMap<String,List<String>> anagram = new HashMap<>();

        for (String s : str){
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            anagram.putIfAbsent(key,new ArrayList<>());
            anagram.get(key).add(s);
        }
        return new ArrayList<>(anagram.values());
    }
}