import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruit=in.next();
        int no= in.nextInt();

        switch (fruit) {
            case "mango" -> System.out.println("good fruit");
            case "apple" -> {
                System.out.println("nice one");
                switch (no) {
                    case 1 -> System.out.println("just one?");
                    case 2 -> System.out.println("thats okay");
                    case 3 -> System.out.println("thats heavy");
                }
            }
            default -> System.out.println("enter a valid fruit");
        }
    }
}
