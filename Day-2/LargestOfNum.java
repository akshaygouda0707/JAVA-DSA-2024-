//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        if(num1>num2){
            System.out.println("num1 "+num1+" is greater");
        }else{
            System.out.println("num2 "+num2+" is greater");
        }
    }
}
