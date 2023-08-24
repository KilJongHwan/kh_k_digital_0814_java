package 싱글톤;
// 객체가 한번만 생성 되는 것
public class SingletonMain {
    public static void main(String[] args) {
        TestObject1 test1 = new TestObject1();
        TestObject2 test2 = new TestObject2();
        test1.setInfo("James", 14);
        for (int i =0; i < 1000; i++){
            test1.setInfo("James", 14);
            test2.setInfo("Jessica", 50);
        }
        test2.viewInfo();
    }
}
