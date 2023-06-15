package functions_assignment;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        System.out.println("This is a program to find max and min of 3 numbers");
        Scanner input= new Scanner(System.in);
        System.out.println("please enter number 1");
        int num1= input.nextInt();
        System.out.println("please enter number 2");
        int num2= input.nextInt();
        System.out.println("please enter number 3");
        int num3= input.nextInt();
        int max=max(num1,num2,num3);
        int min=min(num1,num2,num3);
        System.out.println("The max is "+ max);
        System.out.println("The min is "+ min);
    }
    static int max(int a, int b, int c){
        int max = a;
        if(b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }

        return max;
    }
    static int min(int a, int b, int c){
        int min=a;
        if (a>b){
            min=b;
        }
        if (a>c){
            min=c;
        }
        return min;
    }
}
