package String;

public class Freq {

    public static void main(String[] args) {
        String str = "aasdddseebb";
        freq(str);
    }

    static void freq(String str){
        int [] freq = new int[26];
        for (char ch :str.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (int i = 0;i< freq.length;i++){
            if (freq[i]>0){
                System.out.println((char)(i+'a')+"->"+freq[i]);
            }
        }
    }
}
