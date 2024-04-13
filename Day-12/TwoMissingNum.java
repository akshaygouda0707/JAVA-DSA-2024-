import java.util.ArrayList;
import java.util.List;

public class TwoMissingNum {
    public static void main(String[] args) {
int arr[]={2,1,3,5,6,7,9};
        System.out.println(sort(arr));
    }
    public static List<Integer> sort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            i++;
        }
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if (arr[j] != j+1) {
                ans.add(j+1);
            }
        }
        return ans;
    }

    private static void swap(int[] arr, int i, int correct) {
int temp=arr[i];
arr[i]=arr[correct];
arr[correct]=temp;
    }
}
