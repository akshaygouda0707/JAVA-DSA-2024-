import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfn=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(bfn.readLine());
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}

/*
Output:
 ****
 ****
 ****
 ****

 */