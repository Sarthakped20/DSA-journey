package normalprac;

public class s21 {
    public static void main(String[] args) {
        int [] arr = {-3,-2,-1,0,1,2};
        maxc(arr);
    }
    static int maxc(int [] arr){
        int ncount = 0;
        int pcount = 0;
        for (int i = 0;i< arr.length;i++){
            if (arr[i]<0){
                ncount++;
            }else {
                pcount++;
            }
        }if (pcount>ncount){
            return pcount;
        }return ncount;
    }
}
