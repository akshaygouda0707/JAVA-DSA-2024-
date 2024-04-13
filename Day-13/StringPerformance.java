public class StringPerformance {
    public static void main(String[] args) {
        String space="";
        for(int i=0;i<26;i++){
            char ch=(char) ('a'+i);
            space=space+" "+ch; //space+=" "+ch;
        }
        System.out.println(space);
    }
}
