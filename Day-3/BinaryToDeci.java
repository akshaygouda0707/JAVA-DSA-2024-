import java.util.Scanner;

public class BinaryToDeci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String s=Integer.toString(num);
        int Deci=Integer.parseInt(s,2);
        System.out.println(Deci);

        //deci to binary
       // String res=Integer.toBinaryString(num);
        //System.out.println(res);

    }
}
