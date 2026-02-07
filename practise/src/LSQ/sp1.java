package LSQ;

import java.util.Stack;

public class sp1 {
    public static void main(String[] args) {
        String str = "{([])}";
        String st2 = "((][))";
        String st3 = "})][({";
        String st4 = "((()))";
        String s = "Sarthak";
        System.out.println(rev(s));
        System.out.println(checkparan(str));
        System.out.println(checkparan(st2));
        System.out.println(checkparan(st3));
        System.out.println(checkparan(st4));
    }


    static boolean checkparan(String str){
        char []ch = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : ch){
            if (c == '{'||c=='['||c=='('){
                stack.push(c);
            } else if (c=='}'||c==']'||c==')') {
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if (c=='}'&& top != '{'|| c==']'&& top !='[' || c==')'&&top!='('){
                    return false;
                }
            }
        }return true;
    }

    static String rev(String str){

     StringBuilder sb = new StringBuilder();
     Stack<Character> chars = new Stack<>();
     char [] ch = str.toCharArray();
     for (char c : ch){
         chars.push(c);
     }
     while (!chars.isEmpty()){
         sb.append(chars.pop());
     }
     return sb.toString();
    }
}
