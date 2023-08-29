package 추상클래스2nd;

public class SmartMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone Pro 15");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();

        Phone phone = new Phone("Mock-Up") {
            @Override
            void call() {
                System.out.println("Mock-Up Phone 이라서 전화가 불가능 합니다.");
            }
        };
        phone.call();
    }
}
