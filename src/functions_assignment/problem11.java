package functions_assignment;

import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        System.out.println("This is a program to print the sum of n natural numbers");
        System.out.println("Please enter the nth natural number");
        Scanner input= new Scanner(System.in);
        int nth= input.nextInt();
        System.out.println("The sum of first "+ nth+" natural number is "+ sum(nth));
    }

    private static int sum(int nth) {
        return (nth*(nth+1))/2;
    }
}
