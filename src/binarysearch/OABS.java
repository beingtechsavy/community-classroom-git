package binarysearch;

public class OABS {
    public static void main(String[] args) {
        int[] ans={1,2,3,4,5,6,7,8,9,15,18};
        int[] ansrev={18,15,9,8,7,6,5,4,3,2,1};
        int target=1;
        int num=Binarysearch(ansrev,target);
        System.out.println(num);
    }
    static int Binarysearch(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        if(arr[start]>arr[end]){
            while(start<=end){
                int mid=start +(end-start)/2;
                if (target>arr[mid]){
                    end=mid-1;
                } else if (target < arr[mid]) {
                    start=mid+1;
                }
                else {
                    return mid;
                }
            }
            return -3;
        } else if (arr[end]>arr[start]) {
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
            return -2;

        }
        return -1;
    }
}
