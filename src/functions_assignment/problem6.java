package functions_assignment;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        System.out.println("This is a program to print the grade of a student");
//        Marks        Grade
//        91-100         AA
//        81-90          AB
//        71-80          BB
//        61-70          BC
//        51-60          CD
//        41-50          DD
//                <=40          Fail
        System.out.println("Please enter your marks out of 100");
        Scanner input=new Scanner(System.in);
        int marks= input.nextInt();
        System.out.println("your grade is "+marks(marks));
    }

    private static String marks(int marks) {
        if (marks>100){
            return "Invalid Input";
        }
        switch (marks/10){
            case 9:
                return "AA";
//                break;
            case 8:
                return "AB";
//                break;
            case 7:
                return "BB";
//                break;
            case 6:
                return "BC";
//                break;
            case 5:
                return "CD";
//                break;
            case 4:
                return "DD";
//                break;
            default:
                return "FAIL";
        }

    }
}
