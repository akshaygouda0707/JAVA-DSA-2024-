import java.util.Scanner;

public class CountNumOcc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Total digit in the number "+n+" is: "+numOcc(n));

    }
    static int numOcc(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
}
