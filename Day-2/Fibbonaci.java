//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int p=0;
        int i=1;
        int count=2;
    
        System.out.print(p+" ");
        System.out.print(i+" ");

        while(count<=num){
            int temp=i;
            i=i+p;
            p=temp;
            count++;
            System.out.print(i+" "); 
           
            

        }
         System.out.println("");

       System.out.println(i);
        
    }
}
