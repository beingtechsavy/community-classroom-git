import java.util.Scanner;

public class sample1 {
    public static void main(String[] args) {
        System.out.println("Enter a number!");
        Scanner next= new Scanner(System.in);
        int num=next.nextInt();
        int counter=0;

        while (num>0){
            if (num%10==7){
                counter++;
            }
            num/=10;
        }
        System.out.println("The number of times your number has 7 is "+ counter);
    }
}
