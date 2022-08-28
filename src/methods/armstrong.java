package methods;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
//        for (int i=0;i<num;i++){
            checkarm(num);
//        }
    }
    static void checkarm(int num) {
        int ans = 0;
        int rem;
        int temp = num;
        while (num != 0) {
            rem = num % 10;
            ans += rem * rem * rem;
            num = num / 10;

        }

//        System.out.println(ans);
    if (temp==ans){
        System.out.println("it is an armstrong number   "+temp);

        }
//        else {
//            System.out.println("not an armstrong number");
//        }

    }
}
