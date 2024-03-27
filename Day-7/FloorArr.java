public class FloorArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8,9,10,11,13,14,18,26,45};
        int target=16;
        int ans=floorArr(arr,target);
        System.out.println(ans);
    }

    private static int floorArr(int[] arr, int target) {
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target<arr[mid]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return e;
    }
}
