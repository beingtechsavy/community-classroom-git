package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays1 {
    public static void main(String[] args) {
//        datatype[] arr=new datatype[size]
//        or directly
        int[] rnos2={19,2,3,4,5};
//        array might not be continous in java because there is no continous memory system like in c and c++.
        int[] rnos={1,2,3,4,5};
//          lets look at the default values of arrays of diff types
//        String[] arr= new String[5];
//        System.out.println(arr[0]);
//        int[] num=new int[5];
//        System.out.println(num[0]);
        Arrays.sort(rnos2);
        System.out.println(Arrays.toString(rnos2));
        System.out.println(rnos2.length);
        System.out.println(Arrays.stream(rnos2).max());
        System.out.println(Arrays.stream(rnos2).average());
    }
}
