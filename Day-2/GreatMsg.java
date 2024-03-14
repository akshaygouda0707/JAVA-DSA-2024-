//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class GreatMsg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Good Morning "+name);
    }
}
