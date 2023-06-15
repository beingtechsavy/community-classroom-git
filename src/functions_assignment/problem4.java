package functions_assignment;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        System.out.println("This is a program to print the area and circumference of the circle");
        System.out.println("Please enter the radius of the circle");
        Scanner input = new Scanner(System.in);
        int radius=input.nextInt();
        double area=area(radius);

        double circumference=circumference(radius);

        System.out.println("The area of the circle is "+ area);
        System.out.println("The circumference of the circle is "+ circumference);
    }

    private static double circumference(int radius) {
        return 2*radius*3.14;
    }

    static double area(int radius) {
        return 3.14*radius*radius;
    }

}
