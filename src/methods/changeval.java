package methods;

import java.util.Arrays;

public class changeval {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        changevalue(arr);
        System.out.println("we changed the value of first element\n"+ Arrays.toString(arr));
    }
    static void changevalue(int[] nums){
        nums[0]=99;
    }
}
