package linearsearch;

public class maxwealth {
    public static void main(String[] args) {
    int[][] in={{1,2,3,4},{1,2,3,4,5},{1,2345,555555}};
        System.out.println(maximumwealth(in));
    }
    public static int maximumwealth(int[][] accounts){
        int max=Integer.MIN_VALUE;
        for(int person=0;person< accounts.length;person++){
            int rowsum=0;
            for (int account =0;account<accounts[person].length;account++){
                rowsum+=accounts[person][account];

            }
            if (rowsum>max){
                max=rowsum;
            }
        }
        return max;
    }
}
