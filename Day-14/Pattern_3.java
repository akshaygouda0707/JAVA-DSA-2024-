import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern_3 {
    public static void main(String[] args)throws IOException {
        int i=0;

        BufferedReader bfn=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bfn.readLine());
        while(i<=n){
            int j=1;
            while(j<=i+1) {
                System.out.print(i+j);
                j++;
            }
                System.out.println();
                i++;
            }
        }
    }

