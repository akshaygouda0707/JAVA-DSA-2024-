//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter P:");
        int P=sc.nextInt();
        System.out.println("Enter Time T: ");
        int T=sc.nextInt();
        System.out.println("Enter R:");
        int R=sc.nextInt();
        float ans=(P*T*R)/100;
        System.out.println("Simple Intrest: "+ans);
    }
}
