//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" ");
        System.out.print("eneter number1: ");
        int number1=sc.nextInt();
        System.out.print("enter number2: ");
        int number2=sc.nextInt();
        int ans=0;
        System.out.print("enter the operater: ");
        char op=sc.next().charAt(0);
        if(op=='+'){
            ans=number1+number2;
            System.out.println("Addition: "+ans);
        }
        else if(op=='-'){
            ans=number1-number2;
            System.out.println("Substraction: "+ans);
        }
        else if(op=='*'){
            ans=number1*number2;
            System.out.println("product: "+ans);
        }
        else if(op=='/'){
            ans=number1/number2;
            System.out.println("Devision: "+ans);
        }
        else if(op=='%'){
            ans=number1%number2;
            System.out.println("Modulus: "+ans);
        }else{
            System.out.println("Invalid operater");
        }

    }
}
