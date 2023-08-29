package 오브젝트클래스;
// toString() : 해당 인스턴스에 대한 정보를 문자열로 반환
// 클래스이름@해시코드 (객체의 메모리 주소를 이용해 해시 코드 생성)
// toString() 메소드는 오버라이딩해서 사용 가능하며 String, Integer 경우에는 오버리딩 되어 있음
public class ObjectClass {
    public static void main(String[] args) {
        Car car1 = new Car();
//        Car car2 = new Car();
//        System.out.println(car1.toString());
//        System.out.println(car2.toString());
//        String test = "A";
//        Integer test2 = 2300;
//        int test3 = 4500;
//        System.out.println(test);
//        System.out.println(test2);
        Car car3 = car1;
        // equals() 메소드 : 인스턴스를 매개변수로 전달받는 참조변수와 비교하여 그 결과를 반환
        System.out.println(car1.equals(car3));
    }
}
class Car {

}
