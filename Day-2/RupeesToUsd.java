import java.util.Scanner;

public class RupeesToUsd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rupee=sc.nextInt();
        float usd=80*rupee;
        System.out.println("Rs."+rupee +" = "+" $."+usd);
    }
}
