import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        //autoboximg-conversion of primitive to object
       /*  char ch='a';
        Character a=ch;
        ArrayList <Integer> arrayList=new ArrayList<>();
        arrayList.add(24);
        System.out.println(arrayList.get(0));
        */

        //unboxing- reverse process of autoboxing
        Character ch='a';
        char a=ch;
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(24);
        //get return the integer value i.e unboxing
        int num=arrayList.get(0);
        System.out.println(num);

    }
}
