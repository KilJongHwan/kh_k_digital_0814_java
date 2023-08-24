package 다형성;

public class Parent {
    protected int num = 1;  // 상속관계와 같은 패키지내에서 접근가능
    int money = 1000000000;

    public void display(){
        System.out.println("Parent class method");
    }
}