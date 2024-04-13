import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k=n;
        while (k>0){
            int j=0;
            while (j<k){
                System.out.print("*");
                j++;
            }
            k--;
            System.out.println();
        }
    }
}
