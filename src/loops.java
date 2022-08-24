import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
//        for (int i=1;i<5;i++){
//            System.out.println(i);
        Scanner in=new Scanner(System.in);
        int a =in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
//        int max=a;
//        if (b>max){
//            max=b;
//        }
//        if (c>max){
//            max=c;
//        }
        int m1=Math.max(a,b);
        int max=Math.max(m1,c);
        System.out.println(max);
    }
}
