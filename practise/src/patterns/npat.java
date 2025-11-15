package patterns;

public class npat {
    public static void main(String[] args) {
        pat(5);
        ogpat(5);
        pat3(5);
    }

    static void pat(int n){
        for (int i =0;i<n;i++){
            for (int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int j=0;j<n;j++){
                if (i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }System.out.println();
        }
    }
    static void ogpat(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
    static void pat3(int n){

//        uppertriangle
        for (int i =0;i<n;i++){
            for (int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int j =0;j<2*i-1;j++){
                if (j==1 || j== 2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }System.out.println();
        }

    }
}
