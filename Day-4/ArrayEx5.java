import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int temp[]=new int[arr.length];
        int j=0;
        int k=arr.length-1;
        for(int i=0;i<arr.length;i++)
            if(arr[i]%2!=0)
                temp[j++]=arr[i];
        else
            temp[k--]=arr[i];

            copyArr(temp,arr);


    }

    private static void copyArr(int[] temp, int[] arr) {
        for(int i=0;i<temp.length;i++)
            arr[i]=temp[i];
        System.out.println(Arrays.toString(arr));

    }
}
