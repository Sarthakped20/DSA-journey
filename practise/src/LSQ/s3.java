package LSQ;

import java.util.Arrays;
import java.util.Stack;

public class s3 {
    public static void main(String[] args) {
        String str = "sarthak";
        System.out.println("OG: "+str);
        System.out.println("Reversed: " + reversed(str));
        int [] arr = {1,2,5,3,6,4};
        int [] arr2 = {2, 1, 5, 3, 4};
        int [] ans = nextG(arr2);
        int [] ans2 = prevgreat(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("Next greater element: "+Arrays.toString(ans));
        System.out.println(Arrays.toString(arr2));
        System.out.println("Previous greater element: "+Arrays.toString(ans2));
    }
    static String reversed(String str){
        Stack<Character> stack = new Stack<>();
        char [] ch = str.toCharArray();

        for (char c : ch){
            stack.add(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return String.valueOf(sb);
    }

    static int [] nextG(int []arr){
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int [] result = new int[n];

        for (int i = n-1;i>=0;i--){
            while (!stack.isEmpty() && stack.peek() <= arr[i] ){
                stack.pop();
            }
            if (stack.isEmpty()){
                result[i]=-1;
            }else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    static int [] prevgreat(int [] arr){
        int n = arr.length;
        int [] res = new int[n];

        Stack<Integer>stack = new Stack<>();
        for (int i =0;i< n;i++){
            while (!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                res[i]=-1;
            }else {
                res[i]=stack.peek();
            }

            stack.push(arr[i]);
        }
        return res;
    }
}
