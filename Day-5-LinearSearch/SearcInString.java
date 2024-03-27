public class SearcInString {
    public static void main(String[] args) {
        String name="Akshay";
        char ch='A';
        if(name.length()==0){
            System.out.println("0");
        }
        int i=0;
        for(char chs:name.toCharArray()){
            if(chs==ch){
                System.out.println("found at index :"+ i);
            }
i++;
        /*for(int i=0;i<name.length();i++){
            if(ch==name.charAt(i)){
                System.out.println("found at index: "+i);
            }

         */
        }
    }
}
