//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class PalindromStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String org=s;
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
            
        }
                System.out.println(rev);
if(org.equals(rev)){
    System.out.println("Palindrome");
}
else{
    System.out.println("Not palindrome");
}

    }
   
}
