import java.util.Scanner;

public class BinaryToDeci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int decimal=0;
        int base=1;
        int temp=num;
        while(temp>0){
            int last_digit=temp%10;
            temp=temp/10;
            decimal+=last_digit*base;
            base=base*2;
        }
        System.out.println(decimal);

    }
}
