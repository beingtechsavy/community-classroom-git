package loops_assignment;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        System.out.println("This is a program in which we subtract the product and sum of digits of an integer");
        int num1=1;
        int num2=0;
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        while (num>0){
            num1*=num%10;
            num2+=num%10;
            num/=10;
        }
        System.out.println("The difference is "+ (num1-num2));
    }
}
