import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern_2 {
    public static void main(String[] args)throws IOException {
        BufferedReader bfn=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bfn.readLine());
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
               // System.out.print("*");
                System.out.print(i+j);
            }
            System.out.println();
        }
    }
}
/*

output:
1
23
345
4567
56789

 */