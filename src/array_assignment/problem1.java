package array_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
//        int[] nums= new int[6];
//        Scanner in = new Scanner(System.in);
//        for (int i = 0; i < nums.length; i++) {
//            nums[i]=in.nextInt();
//        }
//        for (int num:nums
//        ) {
//            System.out.println(num+" ");
//        }


        String[] word= new String[6];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < word.length; i++) {
            word[i]=in.next();
        }
        // A normal output below
        for (String words:word
        ) {
            System.out.println(words+" ");
        }
        // A good way of output below, it gives in an array itself
        System.out.println(Arrays.toString(word));
    }
}
