package normalprac;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(countVowel(str));

    }
    static int countVowel(String str){
        char [] ch = str.toCharArray();
        int count = 0;
        int left = 0;
//        int right = ch.length-1;
        for (int i =left; i< ch.length;i++){
            char c = Character.toLowerCase(ch[i]);
            if ( c == 'a'|| c == 'e' || c== 'i' || c == 'o' || c == 'u'){
                count ++;
            }
            left++;
        }
        return count;
    }
}
