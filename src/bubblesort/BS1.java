package bubblesort;

import java.util.Arrays;

public class BS1 {
    public static void main(String[] args) {
        int[] nums={9,8,7,6,5,4,3,2,1,-85};
        bubblesort(nums);
        System.out.println(Arrays.toString(nums));
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
