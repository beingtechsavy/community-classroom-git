package Binaryinterviewqs;

public class mountainarrayqs {
    public static void main(String[] args) {
        int[] nums={1,2,6,75,4,3};
        System.out.println(msearch(nums));
    }
    static int msearch(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start+1)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                start=mid+1;
            } else if (arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) {
                end=mid-1;

            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
