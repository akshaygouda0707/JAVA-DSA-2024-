import java.util.Scanner;

public class TrailingZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("trailn zero's count is: "+trailingZero(n));
    }
    static int trailingZero(int n){
        int res=0;
        int pow=5;
        while(n>=pow){
            res=res+(n/pow);
            pow=pow*5;
        }
        return res;
    }
}
