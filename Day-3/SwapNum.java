//Using Temporary variable
//Using opertor
//using xor operator
//using arithmatic operator

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //using tempory variable
        /*int temp=a;
        a=b;
        b=temp;
        */

        //using operator
        /*a=a-b;
        b=a+b;
        a=b-a;*/

        //using XOR operator
       /*
       
        a=a^b;
        b=a^b;
        a=b^a;
        */

        //Using arithmatic operator
        a=(a+b)-(b=a);

    
        System.out.println("value of a: "+a);
        System.out.println("value of b: "+b);

    }
}
