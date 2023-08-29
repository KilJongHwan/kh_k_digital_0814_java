package 클론오브젝트;

public class CloneObject {
    public static void main(String[] args) {
        Member mem1 = new Member("bear", "곰", "123456",20, true);
        Member mem2 = mem1;
        mem1.viewInfo();
        mem2.name = "KH";
        mem2.password = "111111";
        mem2.viewInfo();
    }
}
