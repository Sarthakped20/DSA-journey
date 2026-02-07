package normalprac;

public class prct12 {
    public static void main(String[] args) {
        System.out.println(anagram("listen","silent"));
    }
    static boolean anagram(String s , String r ){
        if(s.length()<r.length()){
            return false;
        }

        int [] freq = new int [256];

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch]++;
        }

        for(int i =0;i<r.length();i++){
            char ch = r.charAt(i);
            freq[ch]--;
        }

        for(int i =0;i<freq.length; i++){
            if(freq[i]==0){
                return true;
            }
        }return false;
    }
}
