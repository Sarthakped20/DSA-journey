package normalprac;

import java.util.Scanner;

public class P3 {


//    static String revStr (String str){
//        char[] ch = str.toCharArray();
//        int left = 0;
//        int right = ch.length-1;
//        while (left<right){
//            char temp = ch[left];
//            ch[left] = ch[right];
//            ch[right]= temp;
//            left++;
//            right--;
//        }return new String(ch);
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Reversed String : "+revStr(str));
    }

    static String revStr(String str){
        char[] ch = str.toCharArray();//converting the above string into char array because arrays are mutable
        int left = 0;
        int right = ch.length-1;
        while (left<right){
//            swaping the chars with the respective indexes
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }return new String(ch);
    }


}
