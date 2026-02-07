package Arrays;

public class TD1 {
    public static void main(String[] args) {
        int [] arr = {7,1,2,5,6,4};
        System.out.println(bysel(arr));
    }

    static int bysel(int [] arr){
        int minprice = Integer.MAX_VALUE;
        int maxp = 0;
        for (int price : arr){
            if (price<minprice){
                minprice = price;
            }else {
                maxp = Math.max(maxp,price-minprice);
            }
        }return maxp;
    }
}
