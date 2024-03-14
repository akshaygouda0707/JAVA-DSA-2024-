/*
You are given an integer n, you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts n into a string s the code will print "Good job". Otherwise it will print "Wrong answer".

n can range between  -100 to 100  inclusive.

Sample Input 0

100
Sample Output 0

Good job 

*/

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        try{
            if(s!=null){
                System.out.println("Good Job");
            }

        }catch(Exception e){
            System.out.println("Wrong Answer");
        }
    }
}
