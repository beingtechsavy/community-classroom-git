package Binaryinterviewqs;

public class rotationcount {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,9,12,0,1,2,3};
        System.out.println(findpeeak(arr)+1);
    }
//    this function is valid for duplicates too!
    static int findpeeak(int[] arr){
        int start=0;
        int end= arr.length;;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (arr[mid]<arr[mid-1] && mid>start){
                return mid-1;
            }
            if (arr[mid]<=start){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
}
