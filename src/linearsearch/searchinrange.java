package linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class searchinrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = {1, 2, 3, 4, 56, 7, 8, 9, 5, 5, 45, 8, 1, 981, 84, 4548, 1, 548, 45, 485, 48, 4, 545, 48, 5};
        System.out.println("these are the elements\n"+ Arrays.toString(num));
        System.out.println("enter the start index");
        int start=in.nextInt();
        System.out.println("enter the end index also the length of array is "+num.length);
        int end=in.nextInt();
        System.out.println("enter the target number");
        int target=in.nextInt();
        srange(num,start,end,target);
    }
    static void srange(int[] num,int start,int end,int target){
        if (start>end) System.out.println("invalid search");
        int count=-1;
        for (int i=start;i<end;i++){
            if (num[i]==target){
                System.out.println("your desired index is "+i);
                count++;
                break;
            }

        }
        if (count==-1){
            System.out.println("invalid search");
        }
    }
}
