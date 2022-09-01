package Binaryinterviewqs;

public class smallestletter {
    public static void main(String[] args) {
        char[] arr={'a','b','d','g','q','u'};
        char target='c';
        System.out.println(sletter(arr,target));

    }
    static char sletter(char[] arr,char target){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start +(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            } else if (target < arr[mid]) {
                end=mid-1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
