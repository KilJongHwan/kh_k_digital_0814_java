package 박싱과언박싱;

public class BoxingName {
    public static void main(String[] args) {
        Integer num = 12;   // Auto Boxing
//        Integer num = new Integer(12);
//        System.out.println(num);
        Character ch = 'x'; // Auto Boxing
        char c = ch;        // Auto Unboxing
        System.out.println(c);
    }
}
