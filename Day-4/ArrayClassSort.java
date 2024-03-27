import java.util.Arrays;

//sort an array using sort() ;
public class ArrayClassSort {
    public static void main(String[] args) {
        int num[]={1,2,-4,-1,0,4,5,6,3};
        Arrays.sort(num,0,5);
        System.out.println(Arrays.toString(num));
    }
}
