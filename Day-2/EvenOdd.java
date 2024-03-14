//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

class EvenOdd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int number=sc.nextInt();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
        if(i%2==0){
            System.out.println(i+" :Even number");
        }
        else{
            System.out.println(i+" :odd Num");
        }
    }
    }
}