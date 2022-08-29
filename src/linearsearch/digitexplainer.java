package linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class digitexplainer {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] nums=new int[5];
        System.out.println("this is a program to determine the size of the elements in an array please enter upto 10 elements");
        for (int i=0;i<5;i++){
            nums[i]=in.nextInt();
        }
//        yeh hai aam zindagi!
//        digitexp(nums);
//        Yeh hai mentos zindagi!
//        for(int i:nums) System.out.println((int)Math.log10(i)+1);

    }
    static void digitexp(int[] nums){
        int noeven=0;

        for(int i:nums){
            int temp=i;
            int count=0;
            if(temp<10 && temp>0)count++;
            while(temp!=0){
                temp=temp/10;
                count++;
            };
            if (count%2==0){
                noeven++;
                System.out.println(i+" contains "+count +" digits (even number of digits)");
            }
            if (count%2!=0){
                System.out.println(i+" contains "+count+" digits (odd number of digits)");
            }
        }
        System.out.println(noeven);
    }
}
