public class PeakElement {
    public static void main(String[] args) {
        int arr[]={0,5,6,7,8,9,10,23,12,13};
        int ans=peakElement(arr);
        System.out.println(ans);

    }

    public static int peakElement(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while (s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid+1]){
                e=mid;
            }else{
                s=mid+1;
            }
        }
        return s;
    }
}
