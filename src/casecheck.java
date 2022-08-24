import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char ch=in.next().trim().charAt(0);
        if (ch>'a'&&ch<'z'){
            System.out.println("it is a lowercase letter");
        } else if (ch>'A'&&ch<'Z') {
            System.out.println("It is an uppercase letter ");
        }
    }
}
