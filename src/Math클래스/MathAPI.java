package Math클래스;
// Math 클래스는 수학에서 자주 사용하는 상수들과 함수를 미리 구현 해놓은 클래스
// Math 클래스의 모든 메소드는 static 이므로 객체 생성 없이 바로 사용
// java.lang 패키지에 포함되어 있어 import 필요 없음
// random() 메소드는 0.1 ~ 1 미만의 임의의 double 값을 반환
public class MathAPI {
    public static void main(String[] args) {
        int rand = (int)(Math.random() * 100);
        System.out.println(rand );
    }
}
