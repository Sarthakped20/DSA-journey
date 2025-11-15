package Collections;

import java.sql.SQLOutput;
import java.util.Stack;

public class C1 {
    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println(isEqual(str));
    }
    static boolean isEqual(String str){
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()){
            if (ch == '{' || ch== '['||ch=='('||ch=='}'||ch==']'||ch==')'){
                stack.push(ch);
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();

                if (ch == '{' && top != '}' || ch== '[' && top!=']'||ch=='('&& top!=')'){
                    return false;
                }
            }
        }return stack.isEmpty();
    }
}
