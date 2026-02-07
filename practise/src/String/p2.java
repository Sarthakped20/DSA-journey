package String;

public class p2 {
    public static void main(String[] args) {
        lCS("abcde","ace");
    }

    static void lCS(String s , String t){
//        int length = s.length()+t.length();
        int maxLen =0;
        int [] freq = new int[256];// to get all characters
        StringBuilder sb = new StringBuilder();
        if (s.length() < 1 && t.length() < 1){
            return;
        }
        for (int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        for (int i =0;i<t.length();i++){
            freq[t.charAt(i)]--;
        }
        for (int i =0;i<freq.length;i++){
            if (freq[i]==0){
                sb.append((char)i);
//                maxLen = sb.length();
            }
        }
        System.out.println(sb.length()+" "+sb);
    }
}
