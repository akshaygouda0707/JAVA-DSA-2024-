import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={4,5,1,2,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i-1;
            int maxindex=findmax(arr,0,last);
            swap(arr,maxindex,last);
        }
    }
public static void swap(int arr[], int first, int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
}
    private static int findmax(int[] arr, int start, int last) {
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
