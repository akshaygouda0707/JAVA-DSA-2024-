import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//int arr[]={3,1,4,5,2};
int arr[]={1, 2, 3, 4, 5};
bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int []arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            for(int j=1;j<= arr.length-i-1;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }

    }
}


/*

class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, two = nums.length-1;
        for (int one = 0; one <= two;) {
            if (nums[one] == 0) swap (nums, one++, zero++);
            else if (nums[one] == 2) swap(nums, one, two--);
            else one++;


        }
    }
    public void swap(int[] nums, int l, int r) {
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }
}

 */