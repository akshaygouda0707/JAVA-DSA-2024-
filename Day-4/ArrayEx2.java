public class ArrayEx2 {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 7, 2, 4, 5};
        int sum = 0;
        int product = 1;
        double average;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        product *= arr[i];
    }
        average=(double)sum/arr.length;
        System.out.println("sum: "+sum+", product: "+product+", average: "+average);
    }
}
