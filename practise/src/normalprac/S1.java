package normalprac;

public class S1 {
    public static void main(String[] args) {
        String str = "A1 Its Simple";
        chatat(str);
        String s = "Its a pleasent day !!";
//        System.out.println(str);
        removeSpace(s);
        String k = "Kya boltey public";
        reverse(str);
        String encp = "AEIOU";
        enc(encp);
    }
    static void chatat(String str){
//        char c = str.charAt();
        int countd =0;
        int countv =0;
        int counti = 0;
        int count =0;
        for (int i =0;i<str.length();i++){
             char c = str.charAt(i);
//            System.out.println(c+" "+(int)c);
            if (Character.isUpperCase(c)){
//                System.out.print(c+" ");
//                System.out.println();
                count++;
            }
            if (Character.isDigit(c)){
//                System.out.print(c);
                countd++;
            }
            if (c =='i' || c =='I'){
                counti++;
            }
            char ch = Character.toLowerCase(c);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                countv++;
            }
        }
        System.out.println(count);
        System.out.println(countd);
        System.out.println(counti);
        System.out.println(countv);
    }

    static void removeSpace(String s){
        String r = "";

        for (int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if (!Character.isWhitespace(ch)){
                r = r+ch;
            }
        }
        System.out.println(r);

    }
    static void reverse(String k){
        String rev = "";
        for (int i =0;i<k.length();i++){
            char ch = k.charAt(i);
            rev = ch + rev;//main logic
        }
        System.out.println(rev);
    }
    static void enc(String encp){
        String alter = " ";
        for (int i =0;i<encp.length();i++){
            char ch = encp.charAt(i);
            char u = Character.toUpperCase(ch);
            if (u=='A'||u=='E'||u=='I'||u=='O'||u=='U'){
                if (i==0) alter = encp + "way";
                else{
                    alter = encp.substring(i)+encp.substring(0,i)+"ay";
                    break;
                }
            }
        }System.out.println(alter);

    }
}
