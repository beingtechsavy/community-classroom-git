package loops_assignment;

import java.util.Scanner;

public class problem3 {
    static int factorial(int a){
        int ans=1;
        for (int i=1; i<=a;i++){
            ans*=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("This is a program to print permutations and combinations of a scenaraio");
        System.out.println("Please enter the total number of elements in the scenario");
        Scanner input=new Scanner(System.in);
        int total= input.nextInt();
        System.out.println("Please enter the number of selection or orders to be formed");
        int r= input.nextInt();
        int ncr=factorial(total)/(factorial(total-r));
        int npr=factorial(total)/(factorial(r)*factorial(total-r));
        System.out.println("The ncr is "+ncr);
        System.out.println("The npr is "+npr);


    }
}
