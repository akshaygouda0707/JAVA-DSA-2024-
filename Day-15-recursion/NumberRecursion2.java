public class NumberRecursion2 {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        /*base function---if there is  no base function ,
        the function will call the function again and again untill
        the computer memory is getting filled .which means stack is full
        then we get stackOverFlow error.
         */

        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);

    }
}
