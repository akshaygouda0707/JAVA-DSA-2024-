import java.util.Arrays;

public class CopyOddFirst {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7};
        int temp[]=new int[array.length];

        int j=0;
        int k=array.length-1;
        for(int i=0;i<array.length;i++)
            if(array[i]%2!=0)
                temp[j++]=array[i];
        else
            temp[k--]=array[i];

        copyOfArr(temp,array);

        System.out.println(Arrays.toString(array));

    }

    static void copyOfArr(int[] temp, int[] array) {
        for(int i=0;i<temp.length;i++){
            array[i]=temp[i];
        }
    }
}
