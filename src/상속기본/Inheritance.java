package 상속기본;
// 상속 : 자식 클래스가 부모 클래스의 기능을 물려 받는 것 (Field 와 Method)
// 키워드는 extends

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Bulldog");
        System.out.println(dog.name);
        dog.sleep();
        HouseDog hdog = new HouseDog();
        hdog.setName("Dachshund");
        System.out.println(hdog.name);
        hdog.sleep(10);
    }
}
