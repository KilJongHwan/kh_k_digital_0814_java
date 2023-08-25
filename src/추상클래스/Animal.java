package 추상클래스;
// 추상 클래스는 클래스 앞에 abstract 키워드를 붙여서 생성
// 추상 클래스는 객체화 안된다.
// 내부에 0개 이상의 추상 메소드가 포함되어 있다.
// 추상 메소드는 상속 받는 클래스에서 오버라이딩 해줘야 한다.(해당 메소드의 기능을 구체화 시킨다.)

public abstract class Animal {
    abstract void cry(); // 추상 메소드 : 상속 받은 클래스에서 구체화 강제(오버라이딩)
    void sleep() {  // 일반 메소드
        System.out.println("Zzz");
    }
}
class Cat extends Animal{
    @Override
    void cry() {
        System.out.println("냐냐");
    }
    @Override
    void sleep(){
        System.out.println("nya Zzz");
    }
}
class Dog extends Animal{

    @Override
    void cry() {
        System.out.println("왕왕");
    }
}
