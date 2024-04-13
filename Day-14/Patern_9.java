import java.util.Scanner;

public class Patern_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<2*n;i++){
            int totalRows=i>n?2*n-i:i;
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
