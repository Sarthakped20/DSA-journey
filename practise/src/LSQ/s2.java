package LSQ;

import java.util.Stack;

public class s2 {
    public static void main(String[] args) {
        String str = "{([])}";
        String st2 = "((][))";
        String st3 = "})][({";
        String st4 = "((()))";
        String s = "Sarthak";
        rev(s);

        System.out.println(check(str));
        System.out.println(check(st2));
        System.out.println(check(st3));
        System.out.println(check(st4));
    }
    static boolean check(String str){
        char [] ele = str.toCharArray();
        Stack<Character>param = new Stack<>();
        for (char e:ele) {
            if (e == '{'|| e=='('||e=='['){
// Checking if opening parenthesis then push in the stack
                param.push(e);
            } else if (e==']'||e==')'||e=='}') {
//  Checking if closing parenthesis and if yes the checking if the stack is empty or not and if empty the return false because the balance is disturbed
                if (param.isEmpty()){
                    return false;
                }
                char top = param.pop();
// Main logic that check in the parenthesis are balanced or not
                if ((e == ')' && top != '(') ||
                        (e == '}' && top != '{') ||
                        (e == ']' && top != '[')) {
                    return false;
                }
            }
        }
//  if everthing is good then true
        return true;
    }


    static void rev(String s){
        Stack<Character>stack = new Stack<>();
        char [] ch = s.toCharArray();
        for (int i=0;i<ch.length;i++){
            stack.push(ch[i]);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}
