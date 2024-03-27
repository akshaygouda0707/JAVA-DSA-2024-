import java.util.Arrays;
import java.util.Scanner;

public class TwoDArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[2][2];
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int[] array:arr){
            System.out.println(Arrays.toString(array));
        }
//System.out.println();
    }
}
