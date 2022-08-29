package linearsearch;

public class stringsearch {
    public static void main(String[] args) {
        String name="kunal";
        char target='j';
        System.out.println(search(name,target));

    }
    static boolean search(String s,char c){
        if (s.length()==0){
            return false;
        }
        int count=-1;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count=i;
                break;

            }
        }
        if(count==-1){
            return false;
        }
        else {
            return true;
        }
    }
}
