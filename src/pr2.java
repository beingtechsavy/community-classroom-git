import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        String st=in.next();
//        String st1="";
//        for (int i=st.length()-1;i>=0;i--){
//            st1=st1+st.charAt(i);
//        } we can also do by this method
//        System.out.println(st1);
        int num= in.nextInt();
        int num2=0;
        while(num>0){
            int rem=num%10;
            num/=10;
            num2=num2*10+rem;
        }
        System.out.println(num2);
    }
}



