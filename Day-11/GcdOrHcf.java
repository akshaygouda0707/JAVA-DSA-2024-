import java.util.Scanner;

public class GcdOrHcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(gcd(num1,num2));
    }
    static int gcd(int number1,int number2) {
        int min=0;
        if (number1 < number2) {
            min=number1;
        }else{
            min= number2;
    }
        for(int i=min;i>1;i--){
            if(number1%i==0&&number2%i==0){
                return i;
            }
        }
        return 1;
    }
}
