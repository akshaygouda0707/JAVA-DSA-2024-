public class FinElement {
    public static void main(String[] args) {
        int array[]={2,3,4,5,14,56};
        int element=14;
        int i=0;
        for(int arr:array){
            if(arr==element){
                System.out.println(element+" "+ i);

            }
            i++;
        }
    }
}
