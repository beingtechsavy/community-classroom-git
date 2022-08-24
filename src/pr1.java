import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String st=in.next();
        int count=0;
        int length=st.length();
//        System.out.println(length);
        Scanner in2=new Scanner(System.in);
        char ch=in2.next().trim().charAt(0);
        System.out.println("The character you have chosen is "+ch);
        System.out.println("First character of the string is "+st.charAt(0));
        for (int i=0;i<length;i++){
            if(ch==st.charAt(i)){
                count++;
            }
        }
        System.out.println("the number of times the no. came is "+count);
    }
}
