package functions_assignment;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        System.out.println("This is a program to print if a number is odd or even");
        System.out.println("Please enter a number");
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        System.out.println("Is the number Even : "+ func(num));
    }
    static boolean func(int num){
        return num%2==0;
    }
}
