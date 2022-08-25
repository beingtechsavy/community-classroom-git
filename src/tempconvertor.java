import java.util.Scanner;

public class tempconvertor {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("please enter temp in celcius");
        Scanner arpan= new Scanner(System.in);
        float celcius= arpan.nextFloat();
        float farenheit=celcius*(9/5)+32;
        System.out.println("your temp in farenheit is "+ farenheit);

    }
}