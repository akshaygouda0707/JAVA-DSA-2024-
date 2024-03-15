import java.io.*;
import java.util.Scanner;

public class InOutput {
    /**
    
     */
    public static void main(String[] args) {
        BufferedReader bfn=new BufferedReader(new InputStreamReader(System.in));
        try {
            String s=bfn.readLine();
            int num1=Integer
            System.out.println("String entered: "+s);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num);
        }
    }
