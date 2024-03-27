public class FirstAndLast {
    public static void main(String[] args) {
        int nums[]={1,2,3,5,7,7,8,9,7,10};
        int target=7;
        System.out.println(firstAndLast(nums,target));
        //System.out.println(ans);
    }
    public static int[] firstAndLast(int[] nums, int target){
        int ans[]={-1,-1};
        boolean findFirstIndex=true;
        int start=search(nums,target,findFirstIndex);
        int end=search(nums,target,findFirstIndex==false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int nums[],int target,boolean findFirstIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;

                if(findFirstIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}
