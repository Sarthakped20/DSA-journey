import java.util.Arrays;

public class Sumtri {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        sumtry(arr);

    }
    static void sumtry(int [] arr){
        if (arr.length<1){
            return;
        }
        int [] temp = new int[arr.length-1];
        if (temp.length<1){
            return;
        }
        for (int i = 0;i<arr.length-1;i++){
            int k = arr[i]+arr[i+1];
            temp[i]=k;
        }
        sumtry(temp);
        System.out.println(Arrays.toString(temp));


    }
}
