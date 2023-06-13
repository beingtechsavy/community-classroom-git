import java.util.Scanner;

public class reverser {
    public static void main(String[] args) {
        System.out.println("This is a program to reverse your number");
        System.out.println("enter your number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int ans = 0;
        while (num > 0) {


        ans=ans*10+(num%10) ;
        num=num/10;
        }
        System.out.println("The reverse number is "+ans);
    }

}
