public class RunningSum {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        int[] ans=runningSum(nums);
        System.out.println(ans);

    }

    private static int[] runningSum(int[] nums) {
        int sum[]=new int[nums.length];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sum[i]=sum[i-1]+nums[i];

        }
        return sum;
    }
}

//LeetCode Solution
/*class Solution {
    public int[] runningSum(int[] nums) {
        // int []sum=new int[nums.length];
        // sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            //sum[i]=sum[i-1]+nums[i];
            nums[i]+=nums[i-1];

        }
        // return sum;
        return nums;
    }
}

 */
