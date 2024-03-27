public class CeilingArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,13,26};
        int target=25;
        int ans=cieling(arr,target);
        System.out.println(ans);
    }

    private static int cieling(int[] arr, int target) {
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return s;
    }
}
