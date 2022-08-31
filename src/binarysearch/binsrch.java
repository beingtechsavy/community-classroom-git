package binarysearch;

public class binsrch {
    public static void main(String[] args) {
        int[] nums={1,2,5,33,101,165,180,190,196,216,300,310,320};
        int target=5456;
        int ans=search(nums,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start +(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            } else if (target < arr[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
