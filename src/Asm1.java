import java.util.Arrays;

public class Asm1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println(Arrays.toString(sumtriangle(arr,0, arr.length-1)));
//        System.out.println(sumtriangle(arr,0,arr.length-1));

    }
    static int[] sumtriangle(int[] arr,int start,int end){
        int[] ans= new int[arr.length-1];

        if (arr.length==2){
            int[] ans1={arr[start]+arr[start+1]};
            return ans1;
        }

        while(start<end ){
            ans[start]=arr[start]+arr[start+1];
            ans[end-1]=arr[end]+arr[end-1];
            start++;
            end--;
        }
        System.out.println(Arrays.toString(ans));
        return sumtriangle(ans,0,arr.length-2);




    }
}
