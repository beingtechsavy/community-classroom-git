package twodArray;

import java.util.Arrays;

public class twodarray {
    public static void main(String[] args) {
        int[][] nums={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int target=33;
        System.out.println(Arrays.toString(search(nums,target)));
    }
    static int[] search(int[][] arr, int target){
        int start=0;
        int end=arr.length-1;
        System.out.println(end);
        while (start<arr.length && end>=0){
//            int end=start+(end-start)/2;
            if(arr[start][end]==target){
                return new int[] {start,end} ;
            }
            if(arr[start][end]<target){
                start++;
            }
            else {
                end--;
            }
        }
        return new int[] {-1,-1};
    }
}
