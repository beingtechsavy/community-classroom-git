package functions_assignment;

import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        System.out.println("This is a program to find if a number is palindrome or not");
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        System.out.println("Is the number Palindrome : "+palindrome(num));
    }

    private static boolean palindrome(int num) {
        int original=num;
        int rem=0;
        while(num>0){
            rem*=10;
            rem+=num%10;
//            rem*=10;
            num/=10;
        }
        return original==rem;
    }
}
