//To find Armstrong Number between two given number.

import java.util.Scanner;

public class AmstrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int TestCase=sc.nextInt();
        int digit=0;
        int sum=0;
        
            int number=sc.nextInt();
            int temp=number;
            int org=number;
            while(number>0){
                number=number/10;
                digit++;
            }
            System.out.println(digit);
            while(temp>0){
                int rem=temp%10;
                temp=temp/10;
                sum=(int)(sum+Math.pow(rem, digit));

            }
            System.out.println(sum);
            if(sum==org){
                System.out.println("Amstrong");
            }
            else{
                System.out.println("Not amstrong");
            }
        }
        
        
    }
