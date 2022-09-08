package methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class varargs {
    public static void main(String[] args) {
       fun(25,56,85,45,67);
    }
    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
    }
}
