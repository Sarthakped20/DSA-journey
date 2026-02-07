package String;

import java.util.HashMap;
import java.util.HashSet;

public class Longeststring {
    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));   // abc
        System.out.println(longestSubstring("pwwkew"));     // wke
        System.out.println(longestSubstring("bbbbb"));
        freq("abcabcbb");// b
        freqc("asdaedfsasf");
    }

    static String longestSubstring(String str){
        int left =0;
        int right = 0;
        int maxlength = 0;
        int start = 0;

        HashSet<Character>seen= new HashSet<>();
        while (right < str.length()){
            char ch = str.charAt(right);

            while (seen.contains(ch)){
                seen.remove(str.charAt(left));
                left++;
            }
            seen.add(ch);
            int window = right-left+1;
            if (window>maxlength){
                maxlength = window;
                start=left;
            }

            right++;
        }return str.substring(start,start+maxlength);
    }

    static String Longest(String str){
        int left = 0;
        int right = 0;
        int maxa = 0;
        int start =0;
        HashSet<Character> seen = new HashSet<>();
        while (right<str.length()){
            char c = str.charAt(right);
            while (seen.contains(c)){
                seen.remove(str.charAt(left));
                left++;
            }
            seen.add(c);
            int window = right-left+1;

            if (window>maxa){
                maxa=window;
                start=left;
            }

            right++;
        }return str.substring(start,start+maxa);

    }

    static void freq(String str){
        int [] result = new int[256];
        for (char c: str.toCharArray()) {
            result[c]++;
        }

        for (int i =0;i<256;i++) {
            if (result[i]>0){
                System.out.println((char)i+"->"+result[i]);
            }
        }
    }

    static void freqc(String str){
        HashMap<Character,Integer> frek = new HashMap<>();
        for (char c : str.toCharArray()){
            frek.put(c,frek.getOrDefault(c,0)+1);
        }
        System.out.println(frek);
    }
}
