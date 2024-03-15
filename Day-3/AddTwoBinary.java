import java.util.Scanner;

public class AddTwoBinary {
    static String addBinary(String x,String y){
        int num1=Integer.parseInt(x,2);
        int num2=Integer.parseInt(y,2);
        int sum=num1+num2;
        String ans=Integer.toBinaryString(sum);
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num1=sc.next();
        String num2=sc.next();
System.out.println(addBinary(num1, num2));   
 }
}
