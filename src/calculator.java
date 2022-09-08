import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("press x to exit");
        Scanner in=new Scanner(System.in);
        char op=in.next().trim().charAt(0);
        while(op!='x'){

            if (op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                int num1 =in.nextInt();
                int num2=in.nextInt();
                if (op=='+'){
                    System.out.println(num1 + num2);
                }
                if (op=='-'){
                    System.out.println(num1 - num2);
                }
                if (op=='/'){
                    System.out.println(num1 / num2);
                }
                if (op=='*'){
                    System.out.println(num1 * num2);
                }
                if (op=='%'){
                    System.out.println(num1 % num2);}
            else {
                break;
            }
            }
        }
    }
}
