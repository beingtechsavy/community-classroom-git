package Binaryinterviewqs;

public class rotatedsearch {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(pbinarysearch(arr,target));
    }
    static int pbinarysearch(int[] arr,int target){
        int pivot =findpeeak(arr);
        if(pivot==-1){
            return search(arr,target,0, arr.length)-1;
        }
        if (arr[pivot]==target){
            return pivot;
        }
        if (arr[0]<target){
            return search(arr,target,0,pivot-1);
        }
        return search(arr,target,pivot+1,arr.length-1);

    }
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
            if (arr[mid]<=arr[start]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
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
