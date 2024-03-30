public class RotationCountArr {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(rotationCount(arr));
    }

    private static int rotationCount(int[] arr) {
        int pivo=pivote(arr);
        return pivo+1;
    }

    private static int pivote(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
