package 열거타입클래스2;

public class EnumClassEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("James", DevType.FRONTEND, Career.JUNIOR, Gender.MALE);
        developer.devInfo();
    }
}
