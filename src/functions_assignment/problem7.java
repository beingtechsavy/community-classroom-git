package functions_assignment;

import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        System.out.println("This is a program to print the factorial of a number");
        System.out.println("Please provide with a number");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        System.out.println("The factorial is "+ factorial(num));
    }

    private static int factorial(int num) {
        int factorial=1;
        for (int i=1;i<=num;i++){
            factorial*=i;
        }
        return factorial;
    }
}
