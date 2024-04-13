import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.print("factorial of "+n+" is: ");
        System.out.println(fact(n));
    }
    static int fact(int n){
        int res=1;
        for(int i=1;i<=n;i++){
            res*=i;
        }
        return res;
    }
}
