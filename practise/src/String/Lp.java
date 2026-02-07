package String;

import java.util.Arrays;

public class Lp {
    public static void main(String[] args) {
        String str = "Hi Iam Sarthak and I love programing in Java.";
        System.out.println("longest String: "+lp(str));
        String s = "listen";
        String t = "silent";
        System.out.println("Checking Anagrams!");
        System.out.println("Normal: "+Anagrams(s,t));
        System.out.println("Using frequency: "+freq(s,t));
    }
    static String lp(String str){
        String [] words = str.split(" ");
        String longest = "";
        for (String word : words){
            if (word.length()>longest.length()){
                longest = word;
            }
        }
        return longest;
    }

    static boolean Anagrams(String s , String t){
        if (s.length() != t.length()) return false;
        char [] a = s.toCharArray();
        char [] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (!Arrays.equals(a,b))return false;

        return true;
    }

    static boolean freq(String s , String t){
        if (s.length() != t.length())return false;
        int [] freq = new int[25];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (char ch : t.toCharArray())freq[ch - 'a']--;

        for (int freqs : freq){
            if (freqs != 0){
                return false;
            }
        }
        return true;
    }


}
