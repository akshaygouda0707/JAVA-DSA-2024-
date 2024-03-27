public class MinMaxArr {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,46,7};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
int i=0;
int j=0;
        for(int array:arr){
            if(array<min){
                min=array;
                i++;
            }
            if(array>max){
                max=array;
                j++;

            }


        }
        System.out.println(min+" is Minimum number found at index :"+i+"  , "+max+" is the maximum number found at index: "+j);
    }
}
