package 다형성;

public class Polymorphism {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        child.out();
        child.display();
        parent.display();

        Parent p = new Child(); // 부모 클래스의 참조 변수로 자식 객체를 접근
        p.display();    // display() 오버라이딩 일어난 자식의 메소드가 호출
    }
}
