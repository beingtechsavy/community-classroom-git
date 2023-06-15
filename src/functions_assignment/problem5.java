package functions_assignment;

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        System.out.println("This is a program to find whether a number is prime or not");
        System.out.println("Please enter a number");
        Scanner input= new Scanner(System.in);
        int num=input.nextInt();
        System.out.println("Is the number prime : "+isprime(num));
    }

    private static boolean isprime(int num) {
        if (num<=1){
            return false;
        }
        int c=2;
        while (c*c<=num){
            if (num%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
