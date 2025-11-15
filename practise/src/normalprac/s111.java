package normalprac;

public class s111 {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(check(str,0,str.length()-1));
        String s = "SartHak";
        System.out.println(reve(s,0, s.length()-1));
        String sent = "Learn Java with real world backend projects";
        System.out.println(longest(sent,""));
    }


    static boolean check(String str,int l , int r){
        while (l<r && !Character.isLetterOrDigit(str.charAt(l))){
            l++;
        }
        while (l<r && !Character.isLetterOrDigit(str.charAt(r))){
            r--;
        }

        if (Character.toLowerCase(str.charAt(l)) != Character.toLowerCase(str.charAt(r))){
            return false;
        }
        l++;
        r--;
        return true;
    }


    static String reve (String s , int l , int r){
        String lo = s.toLowerCase();
        char [] cs = lo.toCharArray();
        while (l<r){
            char temp = cs[l];
            cs[l++]=cs[r];
            cs[r--]= temp;
        }
        return new String(cs);
    }


    static String longest (String sent ,String ls){
        String [] words = sent.split(" ");
        for (String word : words){
            if (word.length()>ls.length()){
                ls = word;
            }
        }
        return ls;
    }

}

