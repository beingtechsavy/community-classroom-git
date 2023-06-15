package functions_assignment;

import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        System.out.println("This is a program that returns all prime numbers between two given numbers.");
        System.out.println("Please enter the small and big number respectively");
        Scanner input=new Scanner(System.in);
        int start= input.nextInt();
        int end= input.nextInt();
        System.out.println("The prime numbers between "+start+" and "+ end+" are ");
        primenum(start,end);
    }

    private static void primenum(int start, int end) {
        if (end<=1){
            System.out.println("No prime numbers");
        }
        for (int i = start; i <= end; i++) {

            // Skip 0 and 1 as they are
            // neither prime nor composite
            if (i == 1 || i == 0)
                continue;

            // flag variable to tell
            // if i is prime or not
            int flag = 1;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                System.out.print(i);
        }

    }
}
