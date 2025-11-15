package normalprac;

public class S2 {
    public static void main(String[] args) {
        String str = "its a huge building";
        delete(str);
        chenge(str);
    }
    static void delete(String str){
        String s = "";
        String ns = "";
        String k = str+" ";//adding extra space to take the last word in the string
        for (int i =0;i<k.length();i++){
            char c = k.charAt(i);
            if (c !=' '){
                s = s+c;
            }else {
//                System.out.println(s);
                if (!s.equals("huge")){
                    ns = ns+s+" ";
                }
                s="";
            }
        }
        System.out.println(ns);

    }
    static void chenge(String str){
        int count =0;
        String s ="";
        String k = str+" ";
        String ns = "";

        for (int i =0;i<k.length();i++){
            char w = k.charAt(i);
            if (w != ' '){
                s+=w;
            }
            else {
                if (count++%2==0){
                    ns= ns+ s.toUpperCase()+" ";
                }
                else {
                    ns=ns+s.toLowerCase()+" ";
                }
                s="";
            }
        }
        System.out.println(ns);

    }
}
