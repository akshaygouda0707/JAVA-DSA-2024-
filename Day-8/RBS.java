//Find the target Rotated array;
public class RBS {
    public static void main(String[] args) {
int arr[]={4,5,6,7,0,1,2};
int target=3;
        System.out.println(findPivot(arr));
        System.out.println(search(arr,target));
    }
    static int search(int arr[],int target){
int pivot=findPivot(arr);
if(pivot==-1){
    return bs(arr,target,0,arr.length-1);
}
if(arr[pivot]==target){
    return pivot;
}
if(target>=arr[0]){
    return bs(arr,target,0,pivot-1);
}
return bs(arr,target,pivot+1,arr.length-1);
    }
    static int findPivot(int arr[]){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid]<arr[mid-1]){
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
    public static int bs(int arr[],int target,int start,int end){
        while(start<=end){
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
