package methods;
import java.util.Scanner;

public class quetsionprimeno {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.println(checkprime(num));
    }
    static String checkprime(int num){
        for (int i=2;i<(num/2);i++){
            if(num%i==0){
                return "not a prime number";
            }
        }
        return "It is a prime number";
    }
}
