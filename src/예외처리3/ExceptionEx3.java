package 예외처리3;
// NullPointerException (NPE) : Java 에서 발생하는 대표적인 런타입 에러, 참조 하려는 객체가 없는 경우에 발생
public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test = null;
        if (test != null){
            String testStr = test.name;
            System.out.println(testStr);
        }
        else {
            System.out.println("test null 입니다.");
        }
    }
}
class Test {
    String name = "James";
}
