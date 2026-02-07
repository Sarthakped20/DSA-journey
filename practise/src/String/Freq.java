package String;

public class Freq {

    public static void main(String[] args) {
        String str = "aasdddseebb";
        freq(str);
        System.out.println("new code");
        String s = "asdasdasssasff";
        freq_count(s);

        System.out.println(rev("I am sarthak"));
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


    static void freq_count (String str){
        int [] fre = new int[25];
        for (char ch : str.toCharArray()){
            fre[ch-'a']++;
        }
        for (int i=0 ; i< fre.length;i++){
            if (fre[i]>0){
                System.out.println((char)(i+'a')+"->"+fre[i]);
            }
        }
    }

    static String rev(String str){
        char[] arr = str.toCharArray();
        int start = 0;
        for (int i =0;i< arr.length;i++){
            if (arr[i]==' '){
                reverse(arr,start,i-1);
                start = i+1;
            }
        }
        reverse(arr,start,arr.length-1);
        return new String(arr);
    }

    static void reverse(char[] arr, int left, int right) {
        while (left<right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
//    static int
}
