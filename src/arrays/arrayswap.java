package arrays;

import java.util.Arrays;

public class arrayswap {
    public static void main(String[] args) {
        int[] a={12,54,65,88,99,27};
        swap(a,1,3);
        System.out.println(Arrays.toString(a));
    }
    static void swap(int[] arr,int a ,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
}
