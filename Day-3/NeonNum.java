/*
 * Case 1:

Input  : 9
Output : Given number  9 is Neon number

Explanation : square of 9=9*9=81;
              sum of digit of square : 8+1=9(which is equal to given number)


Case 2:

Input : 8
Output : Given number is not a Neon number
 
Explanation : square of 8=8*8=64
              sum of digit of square : 6+4=10(which is not equal to given number)
 * 
 * 
 */

public class NeonNum {
    public static int neonNum(int n){
        int square=n*n;
        int sum=0;
        while (square>0) {
            int rem=square%10;
            square=square/10;
            sum+=rem;
        }
        return sum;
    }
    public static void main(String[] args) {

        System.out.println(neonNum(7));
    }
}
