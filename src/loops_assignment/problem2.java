package loops_assignment;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        System.out.println("This is a program to print all the factors of a number");
        Scanner input= new Scanner(System.in);
        int num=input.nextInt();
        int fact=1;
        int counter=0;
        while (fact<=num/2){
            if (num%fact==0){
                counter++;
                System.out.println(fact+" is a factor");
            }
            fact++;
        }
        System.out.println("In total you have "+counter+" factors");
    }
}
