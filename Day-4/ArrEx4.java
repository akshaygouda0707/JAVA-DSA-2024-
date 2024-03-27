//

import java.util.Arrays;

public class ArrEx4 {
    public static void main(String[] args) {
        int arr[]=new int[]{2,3,45,6,-7};
      //  minMaxArray(arr);
       maxArr(arr);
       minArr(arr);
    }

   private static void minArr(int[] arr) {
        int min=Integer.MAX_VALUE;
        int ans1[]=new int[1];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
                ans1[0]=min;
            }
        }
        System.out.println("Min val of array: "+Arrays.toString(ans1));
    }

    private static void maxArr(int[] arr) {
        int max=Integer.MIN_VALUE;
        int ans[]=new int[1];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]) {
                max = arr[i];
                ans[0]=max;
            }
        }
        System.out.println("Max val of array: "+Arrays.toString(ans));
    }

   /* private static void minMaxArray(int[] arr) {

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            min = (arr[i] < min) ? arr[i] : min;
            max = (arr[i] > max)?arr[i]:max;
        }
        System.out.println("Minimum value of the array: "+min);
        System.out.println("Maximum value of the array: "+max);

    }
    */



}

