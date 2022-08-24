import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        for (int i=1;i<num;i++){
            int temp=b;
            b+=a;
            a=temp;

        }
        System.out.println(b);
        System.out.println("hello");
    }
}
