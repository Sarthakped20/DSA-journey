package normalprac;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("is Palindrome : "+ isPalin(str));
    }
    static boolean isPalin(String str){
        int left = 0;
        int right = str.length()-1;
        while (left<right){
            if (str.charAt(left)!= str.charAt(right)){
                return false;
            }left++;
            right--;
        }
        return true;
    }
}
