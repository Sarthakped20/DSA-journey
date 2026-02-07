package String;

public class s261 {
    public static void main(String[] args) {
        rev("sarthak");
        System.out.println(isPalin("sarthaks"));
        freq("aadsasd");
        fnr("aabccabssdaaas");
        System.out.println(isAnagram("listen","silent"));
    }

    static void rev (String str){
        int left = 0;
        int right = str.length()-1;
        char [] arr = str.toCharArray();

        while (left<right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println(new String(arr));
    }
    static boolean isPalin(String str){
        int start =0;
        int end = str.length()-1;
        for (int i =start;i<end/2;i++){
            if (str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }return true;
    }
    static void freq(String str){
        int freq [] = new int [256];
        for (int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch]++;
        }

        for (int i =0;i<freq.length;i++){
            if (freq[i]>0){
                System.out.print((char)i+"->"+freq[i]+" ");
            }
        }System.out.println();
    }
    static void fnr(String str){

        int freq [] = new int [256];
        for (int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch]++;
        }

        for (int i =0;i< str.length();i++){
            char ch = str.charAt(i);
            if (freq[ch]==1){
                System.out.println(ch);
                break;
            }
        }
    }
    static boolean isAnagram(String str,String s){
        if (str.length()!= s.length()){
            return false;
        }
        int freq [] = new int [256];
        for (int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch]++;
        }
        for (int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch]--;
        }
        for (int i =0;i<freq.length;i++){
            if (freq[i]>0){
                return false;
            }
        }return true;
    }
}
