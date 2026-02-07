package Sliding_Window;

public class SW1 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int [] arr2 = {1,-2,3,-1,2,4};
        System.out.println(sumok(arr,4));
        System.out.println(avgok(arr,3));
        fnn(arr2,3);
        System.out.println();
        System.out.println(longestSubstringKDistinct("erqwdreevcv",3));
    }

    static int sumok(int [] arr , int k){
        int windowsum =0;
        int maxsum =0;
        for (int i=0;i<k;i++){
            windowsum += arr[i];
        }
        maxsum = windowsum;
        for (int i=k;i<arr.length;i++){
            windowsum = windowsum - arr[i-k]+arr[i];
            maxsum = Math.max(maxsum,windowsum);
        }
        return maxsum;
    }
    static double avgok(int []arr,int k){
        int windowsum =0;
        int maxavg = 0;
        for (int i =0;i<k;i++){
            windowsum += arr[i];
        }
        maxavg=windowsum;
        for (int i =k;i<arr.length;i++){
            windowsum = (windowsum -arr[i-k]+arr[i]);
            maxavg = Math.max(maxavg,windowsum);
        }
        return (double) maxavg/k;
    }
    static void fnn(int [] arr,int k){
//        int min = Integer.MAX_VALUE;
        for (int i=0;i<k;i++){
            if (arr[i]<0){
                System.out.print(arr[i]);
                break;
            }
        }
        for (int i=k;i<arr.length;i++){
            if (arr[i]<0){
                System.out.print(arr[i]);
            }
        }
    }

    static int longestSubstringKDistinct(String str, int k) {
        int[] freq = new int[256];
        int left = 0;
        int distinct = 0;
        int maxLen = 0;

        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);

            if (freq[ch] == 0) {
                distinct++;
            }
            freq[ch]++;

            // Shrink window if more than k distinct characters
            while (distinct > k) {
                char leftChar = str.charAt(left);
                freq[leftChar]--;

                if (freq[leftChar] == 0) {
                    distinct--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }


    static void sskd (String str,int k){
        boolean [] freq = new boolean[256];

        for (int i=0;i<str.length();i++){

            char ch = str.charAt(i);
            if (!freq[ch]){
                System.out.println(ch);
            }
        }
    }
}
