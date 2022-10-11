package patterns;
import java.lang.Math;
public class patternbasic {
    public static void main(String[] argcs){
        pattern31(9);
//        pattern1(10);
//        pattern2(10);
//        pattern3(10);
//        pattern4(10);
//        pattern5(10);
    }
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for (int col=0;col<=i;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=0;i<=n;i++){
            for (int col=0;col<=n;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=0;i<n;i++){
            for (int col=0;col<(n-i);col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i=0;i<n;i++){
            for (int col=0;col<=i;col++){
                System.out.print(col+1);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int i=1;i<=(2*n-1);i++){
            int leng=n-Math.abs(n-i);
            for (int col=0;col<leng;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int i=1;i<=(2*n-1);i++){
            int leng=n-Math.abs(n-i);
            int noofspaces=n-leng;
            for (int j=0;j<=noofspaces;j++){
                System.out.print(" ");
            }
            for (int col=0;col<leng;col++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            int leng=n-Math.abs(n-i);
            int noofspaces=n-leng;
            for (int s=0;s<=noofspaces;s++){
                System.out.print(" ");
            }
            for (int col = i; col >0; col--) {
                System.out.print(col);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern8(int n) {
        for (int i = 1; i <=2* n; i++) {
            int c=i > n ? 2*n-i:i;
            for (int s=0;s<n-c;s++){
                System.out.print("  ");
            }
            for (int col = c; col >=1; col--) {
                System.out.print(col+" ");
            }
            for (int j = 2; j <= c; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        for (int i=0;i<=2*n;i++){

            for (int j=0;j<=2*n;j++){
                int ldist=j;
                int rdist=(2*n)-j;
                int updist=i;
                int downdist=(2*n)-i;
                int ans=Math.min(Math.min(ldist,rdist),Math.min(updist,downdist));
                int ValInd=ans;
                System.out.print(ValInd+" ");
            }
            System.out.println();
        }
    }


}
