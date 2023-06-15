package functions_assignment;

import java.util.Scanner;



public class problem3 {
    public static void main(String[] args) {
        System.out.println("This is a program to find if you are eligible to vote");
        System.out.println("Please enter your age");
        Scanner input= new Scanner(System.in);
        int age=input.nextInt();
        System.out.println("Are you eligible to vote : "+func(age));
    }
    static boolean func(int age){
        return age>=18;
    }
}
