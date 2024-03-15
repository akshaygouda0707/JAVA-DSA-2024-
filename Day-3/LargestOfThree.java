//Largest of three number

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
       // int largest=a>(b>c?b:c)?a:(b>c?b:c);
       int largest;
       if(a>b&&a>c){
        largest=a;
        System.out.println("largest is a: "+largest);
       }
       else if(b>a&&b>c){
        largest=b;
        System.out.println("largest is b: "+largest);

       }else{
        largest=c;
        System.out.println("lagest is c: "+largest);
       }
    }
}
