import java.util.Scanner;

public class LcmOfNums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //int ans=(a>b)?a:b;
        int ans=a>(b>c?b:c)?a:(b>c?b:c);
        
        while(true){
            if(ans%a==0&&ans%b==0&&ans%c==0)
              break;
            
            ans++;
        }
        System.out.println(ans);
    }
}
