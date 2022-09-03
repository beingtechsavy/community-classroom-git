package Binaryinterviewqs;

public class mountain_sol_k {
    public static void main(String[] args) {
        int[] nums={1,3,5,7,9,18,6,4,2};
        int ans=mountainarray(nums);
        System.out.println(ans);
    }
    static int mountainarray(int[] arr){
        int start =0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end=mid;
            }
            else {
                start=mid +1;
            }
        }
        return start ;
    }
}
