package methods;

public class shadowing {
    static char ch='a';
    public static void main(String[] args) {
        System.out.println(ch);
        char ch='c';
        System.out.println(ch);
        fun();
    }
    static void fun(){
        System.out.println(ch);
    }
}
