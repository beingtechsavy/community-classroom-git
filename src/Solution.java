class Solution {
    public static void main(String[] args) {
        int[] arr={-1,0,4,55,9,12};
        int target=9;
        System.out.println(search(arr,0));
    }
    static boolean search(int[] arr,int index){
        if(index== arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && search(arr,index+1);
    }
}