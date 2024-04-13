public class MessageRecu {
    public static void main(String[] args) {
        msg();
    }
    static void msg(){
        System.out.println("Hello");
        msg1();
    }
    static void msg1(){
        System.out.println("Hello");
        msg2();
    }
    static void msg2(){
        System.out.println("Hello");
        msg3();
    }
    static void msg3(){
        System.out.println("Hello");
        msg4();
    }
    static void msg4(){
        System.out.println("Hello");
    }
}
