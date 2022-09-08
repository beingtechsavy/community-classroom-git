package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> in=new ArrayList<>(10);
        for (int i=0;i<3;i++){
            in.add(new ArrayList<>());
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<5;j++){
                in.get(i).add(num.nextInt());
            }
        }
//        in.add(455);
//        in.add(55);
//        for (int a:in) System.out.println(a);
//        System.out.println(in);
//        in.set(0,999);
        System.out.println(in);
//        use get method as list[i] syntax will not work here
    }
}
