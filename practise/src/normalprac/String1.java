package normalprac;

public class String1 {
    public static void main(String[] args) {
        String s = "NITNn";
        System.out.println(palin(s));
    }
    static boolean palin(String s){

        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()){
            result.append(Character.toLowerCase(ch));

        }
        String rev = new StringBuilder(result).reverse().toString();
        return result.toString().equals(rev);
    }
}
