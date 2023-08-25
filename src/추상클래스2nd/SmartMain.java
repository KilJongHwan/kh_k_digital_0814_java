package 추상클래스2nd;

public class SmartMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone Pro 15");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();
    }
}
