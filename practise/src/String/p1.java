package String;

import java.util.HashMap;

public class p1 {
    public static void main(String[] args) {
        System.out.println(rev("Sarthak"));
        System.out.println(isPalin("niti"));
        count("asdadadaasdasda");
        System.out.println(anagram("tea","eat"));

        fnonrepeat("cbd");
        revsent("java is awesome");
        worepeat("abcabcbeb");
        System.out.println();
        longest("abcabcbeb");
    }

    static String rev (String str){
        char [] arr = str.toCharArray();
        int s = 0;
        int e = arr.length-1;
        while (s<e){
            char temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }

        return new String(arr);
    }

    static boolean isPalin(String str){
        char [] ch = str.toCharArray();
        int s = 0;
        int e = ch.length-1;
        if (ch.length<2){
            return false;
        }
        for (int i=0;i<ch.length/2;i++){
            if (ch[s]!=ch[e]){
                return false;
            }
        }
        return true;
    }

//    static void Countfreq(String str){
//        HashMap<Character,Integer>freq=new HashMap<>();
//
//
//    }
    static void count (String str){
        int [] freq = new int[256];
        for (int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch]++;
        }

        for (int i =0;i< freq.length;i++){
            if (freq[i]>0){
                System.out.println((char)i+"->"+freq[i]);
            }
        }
    }

    static boolean anagram(String r , String s){
        if (r.length()!=s.length()){
            return false;
        }
        int [] freq = new int[256];

        for (int i =0;i<s.length();i++){
            freq[s.charAt(i)]++;
            freq[r.charAt(i)]--;
        }
        for (int i=0;i<freq.length;i++){
            if (freq[i]!=0){
                return false;
            }
        }
        return true;
    }

    static void fnonrepeat(String str){
        int [] freq = new int[256];
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch]++;
        }
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (freq[ch]==1){
                System.out.println("First non repeating: "+ch);
                return;
            }
        }
    }
    static void revsent(String str){
        String [] words = str.split(" ");
        for (int i = words.length-1;i>=0;i--){
            System.out.print(words[i]);
            if (i!=0){
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    static void worepeat(String str){
//        String general = str.toLowerCase();
        boolean freq[]=new boolean [256];
//        boolean seen = false;

        for (int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if (!freq[ch]){
                System.out.print(ch);
                freq[ch]=true;
            }
        }
    }

    static int longest(String s){
        int [] freq = new int[256];
        int left =0;
        int maxl = 0;
        int start = 0;


        for (int right =0;right<s.length();right++){
            char ch = s.charAt(right);
            freq[ch]++;


            while (freq[ch]>1){
                freq[s.charAt(left)]--;
                left++;
            }

            maxl = Math.max(maxl,right-left+1);
        }
        System.out.println("Longest substring : "+s.substring(start,start+maxl));
        return maxl;
    }
}
