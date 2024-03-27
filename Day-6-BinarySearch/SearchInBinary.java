import java.util.Scanner;

public class SearchInBinary {
    public static void main(String[] args) {
        int array[]=new int[]{1,2,3,11,12,13,14,36};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
       int ans= binarySearch(array,target);
        System.out.println(ans);
    }

    private static int binarySearch(int[] array,int target) {
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<array[mid]){
                end=mid-1;
            } else if (target>array[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;

    }

}
