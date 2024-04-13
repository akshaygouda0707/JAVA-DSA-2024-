import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<=n;i++){
            int totalRows=i>n?n:i;
            int noSpace=n-totalRows;
           for(int s=0;s<noSpace;s++){
                System.out.print(" ");
            }


            for(int j=0;j<totalRows;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
