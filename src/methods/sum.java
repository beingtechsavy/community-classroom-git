package methods;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Sum();
    }
    static void Sum(){
        System.out.println("this is a program to add 2 numbers");
        Scanner in=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=in.nextInt();
        System.out.println("enter the second number");
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println("the sum of a and b is "+sum);
    }
}
