package arrays;

public class maxitem {
    public static void main(String[] args) {
        int[] a={12,54,65,88,99,27};
        System.out.println(max(a));
        for (int ar:a) System.out.println(ar);;
    }
    static int max(int[] a){

        int temp=-44444444;
        for (int i=0;i<a.length;i++){
            if (a[i]>temp) {
                temp = a[i];
            }
        }
        return temp;
    }
}
