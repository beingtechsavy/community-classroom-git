package selectionsort;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] nums={9,8,7,6,5,4,3,2,1,-85};
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void selection(int[] arr){
        for (int i=0;i< arr.length;i++){
            int last= arr.length-i-1;
            int max=getMaxindex(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int getMaxindex(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static void bubblesort(int[] arr){
        boolean swap;
        for (int i=0;i<arr.length;i++){
            swap=false;
            for (int j=1;j< arr.length-i;j++){
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }

            }
            if (!swap){
                break;
            }
        }
    }
}
