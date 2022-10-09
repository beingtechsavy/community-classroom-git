public class SB {
    public static void main(String[] args){
        StringBuilder build=new StringBuilder();
        for(int i=0;i<26;i++){
            char letter=(char)('a'+i);
            build.append(letter);
        }
        System.out.println(build);
        System.out.println(build.charAt(6));
        System.out.println(build.reverse());
        System.out.println(build.toString());
    }
}
