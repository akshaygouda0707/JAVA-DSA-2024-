//Enter n inputs from the user check the number entered is less than 0 or greater than 20 try again to take "n" value and print the input


import java.util.Arrays;
import java.util.Scanner;



public class ArrayEx1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


        while (n>20||n<=0) {
            System.out.println("invalid number" + "try again");
            n = sc.nextInt();
        }
int []array=new int[n];
        fillArray(array);
        printArray(array);
    }

    private static void printArray(int[] array) {

        System.out.println(Arrays.toString(array));
    }


    private static void fillArray(int[] array) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<array.length;i++)
            array[i]=sc.nextInt();
    }
}
