package linearsearch;


import java.util.ArrayList;
import java.util.Scanner;

public class minfinder {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> num= new ArrayList<>(10);
        System.out.println("now input an array till you want but first mention its size");
        int arraysize= in.nextInt();
        int count=0;
        while(count<arraysize){
            num.add(in.nextInt());
            count++;
        }
        max(num);
        System.out.println("program stopped   "+num);

    }
    static void max(ArrayList<Integer> in){
        int min =Integer.MAX_VALUE;
        for (int i=0;i<in.size();i++){
            if(in.get(i)<min){
                min= in.get(i);

            }
        }
        System.out.println("the minimum value of the arraylist is "+min);
    }
}