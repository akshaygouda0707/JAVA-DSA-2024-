public class FindInMountainArr {
    public static void main(String[] args) {
        /**
         * // This is MountainArray's API interface.
         * // You should not implement it, or speculate about its implementation
         * interface MountainArray {
         *     public int get(int index) {}
         *     public int length() {}
         * }
         */
        int arr[]={1,2,3,4,5,3,1};
        int target=3;
        int ans=findInMountainArray(target,arr);
        System.out.println(ans);
    }
            public static int findInMountainArray(int target, int arr[]) {
                int peak=peakIndex(arr);
                int firstTry=orderignosticArr(arr,target,0,peak);
                if(firstTry!=-1){
                    return firstTry;
                }
                return orderignosticArr(arr,target,peak+1,arr.length-1);

            }
            public static int peakIndex(int arr[]){
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
            static int orderignosticArr(int arr[],int target,int start,int end){
                boolean isAsc=arr[start]<arr[end];
                while(start<=end){
                    int mid=start+(end-start)/2;
                    if(arr[mid]==target){
                        return mid;
                    }
                    if(isAsc){
                        if(arr[mid]>target){
                            end=mid-1;
                        }else{
                            start=mid+1;

                        }
                    }
                    else{
                        if(arr[mid]<target){
                            end=mid-1;
                        }else{
                            start=mid+1;
                        }

                    }
                }
                return -1;
            }
        }
