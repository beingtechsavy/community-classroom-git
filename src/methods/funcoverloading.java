package methods;

public class funcoverloading {
    public static void main(String[] args) {
//        this is a program to represent function overloading
//        the thing that matters here is the parameters
//        either the no. or the type of arguments should be different
        fun(65);
        fun("arpan");
    }
    static void fun(String name){
        System.out.println(name);
    }
    static void fun(int num){
        System.out.println(num);
    }
}
