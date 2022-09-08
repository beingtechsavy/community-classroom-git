package linearsearch;

public class p1 {
    public static void main(String[] args) {
        int count=-1;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 55, 44, 66, 2, 45, 7, 9, 8, 2, 5, 2, 4, 98, 6, 87, 6, 78, 4, 87, 45, 8, 4, 8};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 55) {

                count=i;
                break;
            }


        }
        if (count!=-1){
            System.out.println("your index is "+count);
        }
        else {
            System.out.println("number not found error 404");
        }

    }
}