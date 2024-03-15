//program to Find the Gcd or Hcf of 2 num

import java.util.Scanner;

public class GcdNum {
    static int gcd(int x,int y){
        
        /*using eucladian algo 
        if(y==0)
        return x;
        return gcd(y, x%y);*/
        if(x==0)
        return y;
        if(y==0)
        return x;
        if(x==y)
        return y;
        if(x>y)
        return gcd(x-y, y);
        return gcd(x, y-x);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(gcd(num1, num2));
    }
}
