package 객체타입확인;
// instanceof : 상속 관계가 성립하는지 확인 하는 용도
// 왼쪽 피연산자가 오른쪽 피연산자의 인스턴스인지를 검사하며,
// 결과는 불리언 값(true 또는 false)으로 반환.

public class InstanceOf {
    public static void main(String[] args) {
        Parent parent = new Parent("Parent");
        Child child = new Child("Child");
        System.out.println(parent instanceof  Parent);  // true
        System.out.println(parent instanceof  Child);   // false
        System.out.println(child instanceof  Parent);   // true
        System.out.println(child instanceof Child);     // true
    }
}
class Parent{
    String name;
    Parent(String name){
        this.name = name;
    }
}
class Child extends Parent{
    Child(String name) {
        super("Parent");
        this.name = name;
    }
}
