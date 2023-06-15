package functions_assignment;

import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        System.out.println("This is a program to find if 3 numbers can be pythagorean triplets" );
        System.out.println("Please enter height base and hypotenuse respectively");
        Scanner input= new Scanner(System.in);
        int height= input.nextInt();
        int base= input.nextInt();
        int hypotenuse= input.nextInt();
        System.out.println("Is your triplet a Pythogorean triplet : "+ Triplet(height,base,hypotenuse));
    }

    private static boolean Triplet(int height, int base, int hypotenuse) {
        return (height*height+base*base)==(hypotenuse*hypotenuse);
    }
}
