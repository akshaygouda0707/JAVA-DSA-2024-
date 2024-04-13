import java.util.Scanner;

public class gdcWidEuclidAlgo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(euclideanGcd(a,b));
    }


        static int euclideanGcd( int a, int b){
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            return a;
        }

}