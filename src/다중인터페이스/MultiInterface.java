package 다중인터페이스;
// 자바는 다중 상속을 지원 하지 않는 언어, 그 대신 인터페이스를 통해서 다중 상속 효과를 이끌어 낸다.
public class MultiInterface {
    public static void main(String[] args) {
        SportsCar ferrari = new SportsCar(false, 18, false,250,"Red",
                "2023",false);
        ferrari.viewInfo();
    }
}
