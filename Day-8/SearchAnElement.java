public class SearchAnElement {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,4,5,5,6,6,7,7,10,10,13,13};
        int ans=searchInsortedArr(arr);
        System.out.println(ans);
    }

    private static int searchInsortedArr(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid%2==1){
                mid--;
            }
            if(arr[mid]!=arr[mid+1]){
                end=mid;
            }else{
                start=mid+2;
            }
        }
        return start;
    }
}
