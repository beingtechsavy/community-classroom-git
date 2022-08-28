package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class multidimensionarray {
    public static void main(String[] args) {
//        adding number of columns is not mandatory
        Scanner num= new Scanner(System.in);
//        int[][] in=new int[3][];
        int[][] in=new int[3][2];
//        System.out.println(in[0][2]);
        for(int i=0;i<in.length;i++){
            for (int j=0;j<in[i].length;j++){
                in[i][j]= num.nextInt();
            }
        }
        for(int[] no:in) System.out.println(Arrays.toString(no));
    }
}
