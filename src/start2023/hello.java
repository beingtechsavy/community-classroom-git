package start2023;
import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        Scanner arpan = new Scanner(System.in);

        System.out.println("please enter your name? ");
        String name =arpan.nextLine();
        System.out.println("Hello,"+name+"\nHow are you doing today?");
    }
}
