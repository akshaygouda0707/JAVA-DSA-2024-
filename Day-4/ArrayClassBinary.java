import java.util.Arrays;

public class ArrayClassBinary {
    public static void main(String[] args) {
        int arr[]={5,6,7,-1,-5,2,3,4};
        Arrays.sort(arr);
        System.out.println("Element found in index: "+Arrays.binarySearch(arr,4));
    }
}
