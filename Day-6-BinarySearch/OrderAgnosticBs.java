import java.util.Scanner;

public class OrderAgnosticBs {
    public static void main(String[] args) {
        //int arr[]={1,2,3,4,5,6,7,23};
        int arr[]={23,21,20,13,12,1,0};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int ans=orderAgnosticBs(arr,target);
        System.out.println(ans);
    }

    private static int orderAgnosticBs(int[] arr, int target) {

        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];


        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;

                } else if (target > mid) {
                    start = mid + 1;

                }
            }else {
                if(target>arr[mid]){
                    end=mid-1;
                }else if(target<arr[mid]){
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
