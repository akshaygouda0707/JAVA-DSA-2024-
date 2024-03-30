import java.util.Arrays;

public class searchInMatrix {
    public static void main(String[] args) {
        int arr[][]={
                {10,20,30,40},
                {25,35,45,55},
                {28,37,48,59}
        };
        int target=37;
        int[] ans=searchMatrix(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchMatrix(int arr[][],int target){
        int ans[]={-1,-1};
        int start=0;
        int end=arr.length-1;
        while(start<arr.length&&end>=0){
            if(arr[start][end]==target){
                return new int []{start,end};
            }
            if(arr[start][end]<target){
                start++;
            }else {
                end--;
            }
        }
        return ans;
    }
}
