package 다형성;

public class Child extends Parent{
    private int x = 100;
    public Child(){}
    public void out(){
        System.out.println("Parent's protected num field : "  + num);
        System.out.println("Child class method");
    }

    @Override
    public void display() {
        System.out.println("상속 받아 재정의한 메소드");
    }
}
