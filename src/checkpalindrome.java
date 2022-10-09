public class checkpalindrome {
    public static void main(String[] args) {
        String sample="125521";
        System.out.println(ispalindrome(sample));
    }
    static boolean ispalindrome(String s1){
        if(s1==null || s1.isEmpty()){
            return true;
        }
        for (int i=0;i<(s1.length()/2);i++){
            int start=i;
            int end=s1.length()-i-1;
            if(start>end){
                return true;
            }
            if(s1.charAt(start)!=s1.charAt(end)){
                return false;
            }
        }
        return true;
    }
}
