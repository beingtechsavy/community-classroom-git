package Binaryinterviewqs;

public class search_infinite {
    public static void main(String[] args) {
        int[] arr={1,3,4,6,7,9,11,13,15,17,19};
        int target =9;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        int start =0;
        int end=1;
        while (target>arr[end]){
            int temp=end+1;
            end=end+2*(end-start+1);
            start=temp;
        }
        return search(arr,target,start,end);
    }
    static int search(int[] arr,int target,int start,int end){
//        int start=0;
//        int end=arr.length-1;
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