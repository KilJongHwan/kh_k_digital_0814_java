package 중첩인터페이스;
// 중첩 인터페이스는 클래스 내부에 선언한 인터페이스
// 중첩 인터페이스는 주로 UI 프로그래밍에서 이벤트 처리를 목적으로 사용
public class NestedInterface {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(new CallListener());
        button.touch();
        button.setOnClickListener(new MessageListener());
        button.touch();
    }
}
