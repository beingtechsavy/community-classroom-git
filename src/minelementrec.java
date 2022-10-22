import java.util.Arrays;

public class minelementrec {
    public static void main(String[] args) {
        int[] arr={1,4,3,-5,-8,9,-45,4};
        System.out.println(minel(arr,arr.length-1));
    }
    static int minel(int[] nums,int end ){
        if (end==1){
            return nums[0];
        }
        int counter= nums.length;
        int start=0;
        int min =15000000;
        for (int i=0;i< nums.length-1;i++){
            if (nums[i]<min){
                min=nums[i];
            }
        }
        counter--;
        return java.lang.Math.min(min,minel(nums,end-1));



    }


}
