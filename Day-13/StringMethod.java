import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String name="Akshay Gowda";
        //System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.split(" ")));
        StringBuilder sb=new StringBuilder();
        System.out.println((sb.append(name.toCharArray()).reverse()));
    }
}
