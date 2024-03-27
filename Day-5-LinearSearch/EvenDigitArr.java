
public class EvenDigitArr {
    public static void main(String[] args) {
        int arr[]={1,2,34,55,67,8,13};
        System.out.println(evenCount(arr));
    }

    private static int evenCount(int[] arr) { 
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(isEven(arr[i])){
                count++;
            }

        }
        return count;
    }

    private static boolean isEven(int i) {
        int digit=digitCount(i);
        return  digit%2!=0;
    }

    private static int digitCount(int i) {
        int count=0;
        while(i>0){
            i=i/10;
            count++;
        }

        return  count;
    }
}
