package recursions;

public class binarysearchrec {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,55,66,88};
        int target=65;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr,int target,int start, int end){
        if (start>end){
            return -1;
        }
        int m=start+(end-start)/2;

        if(target==arr[m]){
            return m;
        }
        if (target<m){
            end=m-1;
            return search(arr,target,start,end);
        }
        if (target>m){
            start=m+1;
            return search(arr,target,start,end);
        }
        return -1;
    }
}
