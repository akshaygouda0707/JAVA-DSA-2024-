import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        System.out.println(isPrime(num));
    }

    private static boolean isPrime(int num) {
       // int count=2;
        for(int i=2;i<num/2;i++) {
            if (num % i == 0) {
                return false;
            }
           // count++;
        }
        return  true;
    }
}
