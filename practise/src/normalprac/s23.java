
package normalprac;
import java.util.*;
public class s23 {
    public static void main(String[] args) {
        String sent = "apple apple apple banana banana mango mango mango";

        String [] words = sent.split(" ");
        List<String>unique = new ArrayList<>();
        List<Integer>freq = new ArrayList<>();

        for (String word : words){
            int index = unique.indexOf(word);
            if (index != -1){
                freq.set(index , freq.get(index)+1);
            }else {
                unique.add(word);
                freq.add(1);
            }
        }
        for (int i =0;i< unique.size();i++){
            System.out.print(unique.get(i)+" "+freq.get(i)+" ");
        }
    }

}
