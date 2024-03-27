public class PeakPointArr {
    public static void main(String[] args) {
        int arr[] = {31, 2, 3, 4, 7,5};
        int ans;
        /*for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]<arr[j]&&arr[j]>arr[i+2]){
                    ans=arr[j];
                    System.out.println(ans+" "+j);


                }
                break;
            }

         */
        int i = 0;
        //int j = i + 1;
        if (arr[0] >= arr[i]) {
            System.out.println(arr[0]);

        }
        if (arr[arr.length - 1] >= arr[arr.length - 2]) {
            System.out.println(arr[arr.length - 1]);
        } else {
            for (int array : arr) {
                if ( array >= arr[i-1] &&array>=arr[i+1]) {
                    System.out.println(array + " " + i);

                }

                break;

            }

        }

    }

}