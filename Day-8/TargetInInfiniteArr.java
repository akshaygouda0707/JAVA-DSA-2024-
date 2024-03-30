public class TargetInInfiniteArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,15,16,17,18};
        int target=10;
        int index=ans(arr,target);
        System.out.println(index);
    }
    static int ans(int arr[],int target){
        int start=0;
        int end=1;
        while(arr[end]<target){
            //double the box
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return posInfiniteArr(arr,target,start,end);
    }
    public static int posInfiniteArr(int arr[],int target,int start,int end){
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }
}
