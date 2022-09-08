package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        int[] nums=new int[3];
//        for (int i=0;i< nums.length;i++) {
//            nums[i] = in.nextInt();
//        }
//        for(int num:nums){
//            System.out.print(num+" ");
//        }
        String[] str= new String[5];
        for (int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
