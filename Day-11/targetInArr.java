import java.util.Scanner;

public class targetInArr {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        int m=read.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=read.nextInt();
        }
        boolean found=true;

        for(int j=0;j<arr.length;j++){
            if(arr[j]==m){
                found=true;
                break;

            }
        }

        if(found){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

}
