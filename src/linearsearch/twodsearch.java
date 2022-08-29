package linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class twodsearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] num={{1,2},{2,3},{4,5,6,4,5,6,8,}};
//        int target= in.nextInt();
        for(int[] a:num){
//            System.out.println("[ ");
            System.out.print(Arrays.toString(a)+"   ");
//            System.out.println(" ]");
        }
        int target= in.nextInt();
        finder(num,target);
    }
    static void finder(int[][] arr,int target){
        for (int[] i:arr){
            for (int l: i){
                if(l==target){
                    System.out.println("your desired number is found at the array of "+Arrays.toString(i)+" -> "+l );
                    break;
                }
            }
        }
    }
}
