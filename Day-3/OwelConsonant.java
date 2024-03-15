//Check wheter alphabet is ovel or consonant

import java.util.Scanner;

public class OwelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("vowel");
        }else{
            System.out.println("consonant");
        }
    }
}
