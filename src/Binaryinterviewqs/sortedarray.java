package Binaryinterviewqs;

import java.util.Arrays;

public class sortedarray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,854)));
    }
    static int[] binarysearch(int[][] matrix,int row,int cstart,int cend,int target){
        while (cstart<=cend){
            int mid= cstart+(cend-cstart)/2;
            if (matrix[row][mid]==target){
                return new int[] {row,mid};
            }
            if (matrix[row][mid]>target){
                cend=mid-1;
            }
            else {
                cstart=mid;
            }
        }
        return new int[] {-1,-1};
    }
    static int[] search(int[][] matrix,int target){
        int start= matrix.length;
        int end=matrix[0].length;
        if (start==1){
            return binarysearch(matrix,0,0,end-1,target);
        }
        int rstart=0;
        int rrows=end-1;
        int cmid=end/2;
        while(rstart<(rrows-1)){
            int mid=rstart+(rrows-rstart)/2;
            if (matrix[mid][cmid]==target){
                return new int[] {mid,cmid};
            }
            if (matrix[mid][cmid]<target){
                rstart=mid;
            }
            else {
                rrows=mid;
            }
        }
        if (matrix[rstart][cmid]==target){
            return new int[] {rstart,cmid};
        }
        if (matrix[rstart+1][cmid]==target){
            return new int[] {rstart+1,cmid};
        }
        if (matrix[rstart][cmid-1]>=target) {
            return binarysearch(matrix,rstart,0,cmid-1,target);
        }
        if (matrix[rstart][cmid+1]<=target && target<=matrix[rstart][end-1]) {
            return binarysearch(matrix,rstart,cmid+1,end,target);
        }
        if (matrix[rstart+1][cmid-1]>= target) {
            return binarysearch(matrix,rstart+1,0,cmid-1,target);
        }
//        if (matrix[rstart+1][cmid-1]<= target){
        else {
            return binarysearch(matrix, rstart + 1, cmid + 1, end - 1, target);
        }

    }
}
