public class SingleElmArr {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4,5,5,6,6};
        int ans=singleNonDuplicate(arr);
        System.out.println(ans);
    }
            public static int singleNonDuplicate(int[] arr) {
                int start=0;
                int end=arr.length-1;
                while(start<end){
                    //boolean findEl=true;
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
                return arr[start];

            }
        }

