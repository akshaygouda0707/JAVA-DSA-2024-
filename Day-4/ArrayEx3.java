import java.util.Scanner;

//write program to count number of occurence of the element in the array
public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[]{1,1,1,2,3,4,5};
        int occ=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==occ){
                count++;
            }
        }
        System.out.println(count);
    }
}
