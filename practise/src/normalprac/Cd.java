package normalprac;

import java.util.ArrayList;

public class Cd {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
//        boolean ans = seen(arr);
//        System.out.println(ans);
        System.out.println(seen(arr));
    }
    static boolean seen (int [] arr){
        ArrayList<Integer>list = new ArrayList<>();
        for (int ele : arr){
//            list.add(ele);
            if (list.contains(ele)) {
                return true;
            }
            list.add(ele);
        }return false;
    }
}
