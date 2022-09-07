package Binaryinterviewqs;

public class ceiling {

//    we have a problem named ceiling of a number through binary search
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=12;
        System.out.println(ceiling(arr,target));

    }
    static int ceiling(int[] arr,int target){
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
        return arr[start];
    }
}