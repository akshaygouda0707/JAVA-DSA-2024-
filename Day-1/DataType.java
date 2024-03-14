/*Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.

To get you started, a portion of the solution is provided for you in the editor.

Input Format:

The first line contains an integer,T , denoting the number of t est cases.
Each test case, T, is comprised of a single line with an integer, n, which can be arbitrarily large or small.

Output Format:

For each input variable n and appropriate primitive DataType, you must determine if the given primitives are capable of storing it. If yes, then print:
n can be fitted in:

* dataType

If the number cannot be stored in one of the four aforementioned primitives, print the line:

n can't be fitted anywhere.

Sample Input

5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000


Sample Output

-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long

*/

import java.util.Scanner;
import java.util.*;
class DataType{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    try{
    for(int i=0;i<t;i++){
        long x=sc.nextLong();
        System.out.println(x+" can be fitted in:");
        if(x>=Byte.MIN_VALUE &&x<=Byte.MAX_VALUE){
            System.out.println("*byte");
        }
        if(x>=Short.MIN_VALUE&&x<=Short.MAX_VALUE){
            System.out.println("* short");

        }
        if(x>=Integer.MIN_VALUE&&x<=Integer.MAX_VALUE){
            System.out.println("*int");
        }
        if(x>=Long.MIN_VALUE&& x<=Long.MAX_VALUE){
            System.out.println("*long");
        }
    }
}catch(Exception e){
System.out.println(sc.next()+"can't be fitted anywhere:");
}
}
}