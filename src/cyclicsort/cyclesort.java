package cyclicsort;
import java.util.Arrays;
public class cyclesort {
    public static void main(String[] args) {
        int nums[]={3,5,2,1,4,6};
        CS(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void CS(int arr[]){
        int i=0;
        while (arr[i]!=i+1){
            swap(arr,i,arr[i]-1);
            if(arr[i]== i+1){
                i++;
            }
            if (i == arr.length-1){
                break;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
