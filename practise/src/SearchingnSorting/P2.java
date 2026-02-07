package SearchingnSorting;

public class P2 {
    public static void main(String[] args) {
        int [] arr = {1,2, 3,4, 5, 6, 9};
        System.out.println("At index: "+Binarysearch(arr,2));
        int [] arr2 = {1,2,3,4,4,4,4,5,6};
        System.out.println("first occurance At index: "+first(arr2,4));
        System.out.println("Last occurence At index: "+last(arr2,4));
        System.out.println( floor(arr,7)+" "+celling(arr,8));

    }

    static int Binarysearch(int [] arr,int target){
        int s =0 ;
        int e = arr.length-1;


        while (s<=e){
            int mid = s+(e-s)/2;
            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]>target ){
                e = mid-1;
            } else {
                s = mid+1;
            }
        }
        return -1;
    }

    static int first(int [] arr , int target){
        int s =0 ;
        int e = arr.length-1;
        int ans = -1;


        while (s<=e){
            int mid = s+(e-s)/2;
            if (arr[mid]==target){
                ans = mid;
                e = mid-1;
            } else if (arr[mid]>target ){
                e = mid-1;
            } else {
                s = mid+1;
            }
        }
        return ans;
    }
    static int last(int [] arr , int target){
        int s =0 ;
        int e = arr.length-1;
        int ans = -1;


        while (s<=e){
            int mid = s+(e-s)/2;
            if (arr[mid]==target){
                ans = mid;
                s = mid+1;
            } else if (arr[mid]>target ){
                e = mid-1;
            } else {
                s = mid+1;
            }
        }
        return ans;
    }
//    4,5,6,7,0,1,2 array


    static int celling (int [] arr , int target){
        int s =0;
        int e = arr.length-1;

        while (s<=e){
            int mid  = s+(e-s)/2;
            if (target>arr[arr.length-1])return -1;
            if (arr[mid]==target)return mid;
            else if (arr[mid]>=target){
                e = mid-1;
            }
            else {
                s = mid+1;
            }
        }return arr[s];
    }
    static int floor(int [] arr,int target){
        int s =0;
        int e = arr.length-1;

        while (s<=e){
            int mid  = s+(e-s)/2;
            if (arr[mid]==target)return mid;
            else if (arr[mid]>=target){
                e = mid-1;
            }
            else {
                s = mid+1;
            }
        }return arr[e];

    }

    static char smallest(char[]letters,char target){
        int s = 0;
        int e = letters.length-1;

        while (s<=e){
            int m = s+(e-s)/2;
            if (letters[m]>target){
                e = m-1;
            }
            else {
                s = m+1;
            }
        }return letters[s % letters.length];
    }

    public int[] searchRange(int[] nums, int target) {
        int [] ans = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0]=start;
        if (ans[0] !=-1){
            ans[1]=end;
        }
        return ans;
    }

    static int search(int[] arr,int target,boolean firstindex){
        int s =0 ;
        int e = arr.length-1;
        int ans = -1;


        while (s<=e){
            int mid = s+(e-s)/2;
            if (arr[mid]>target ){
                e = mid-1;
            } else if(arr[mid]<target) {
                s = mid+1;
            }
            else {
                ans = mid;
                if (firstindex){
                    e = mid-1;
                }else {
                    s = mid+1;
                }
            }

        }
        return ans;
    }
}
