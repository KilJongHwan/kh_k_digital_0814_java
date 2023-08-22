package 클래스기본;

public class ClassBasic {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("James");
        s1.setAddr("NewYork");
        s1.showInfo();
        Student s2 = new Student();
        s2.setName("Kane");
        s2.setAddr("Brazil");
        s2.showInfo();
        Student s3 = new Student();
        s3.setName("Yuki");
        s3.setAddr("tokyo");
        s3.showInfo();
    }
}
