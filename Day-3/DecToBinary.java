import java.util.Scanner;

public class DecToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem,quotient=num;
        String binary_num="";
        while(quotient>0){
            rem=quotient%2;
            quotient=quotient/2;
            binary_num=rem+binary_num;
           // System.err.println(binary_num);
        }
        System.err.println(binary_num);
    }
}
