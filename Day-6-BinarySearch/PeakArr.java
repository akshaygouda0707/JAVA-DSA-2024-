public class PeakArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int ans=peakArr(arr);
        System.out.println(ans);
    }

    private static int peakArr(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}
