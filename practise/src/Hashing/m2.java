package Hashing;

import java.util.HashMap;

public class m2 {
    public static void main(String[] args) {
        hashmaps();
        countChar("banananananan");
        countWords("java code java practice code java");
        Nonrepeat("sarthak");
    }

//basic Insertion , delete etc operations on Maps
    static void hashmaps(){
        HashMap<String,Integer> popu = new HashMap<>();

        popu.put("India",140);
        popu.put("Usa",90);
        popu.put("Russia",40);

        System.out.println( "Population of India: "+popu.get("India"));
        System.out.println(popu.containsKey("India"));
        System.out.println(popu.containsValue(30));
        popu.getOrDefault("Brazil",0);
        popu.remove("Usa");
        for (String key : popu.keySet()){
            System.out.println(key+"->"+popu.get(key));
        }
    }
    static void countChar(String str){
        HashMap<Character,Integer> Count = new HashMap<>();
        for (char c : str.toCharArray()){
            Count.put(c,Count.getOrDefault(c,0)+1);
        }
        System.out.println(Count);
    }

    static void countWords(String s){
        String [] words = s.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for (String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        }

        System.out.println(map);
    }


    static void Nonrepeat(String str){
        HashMap<Character,Integer> chars = new HashMap<>();
        for (char ch : str.toCharArray()){
            chars.put(ch,chars.getOrDefault(ch,0)+1);
        }

        for (char c : str.toCharArray()){
            if (chars.get(c)==1){
                System.out.println("First Non repeating Character: "+c);
                return;
            }


        }System.out.println("No unique Characters!");
    }
}
