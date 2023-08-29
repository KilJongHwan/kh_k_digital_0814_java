package 클론오브젝트;

public class CloneObject {
    public static void main(String[] args) {
        Member mem1 = new Member("bear", "곰", "123456",20, true);
        Member mem2 = mem1.getMember(); // 얕은 복사가 일어나는 조건
        mem1.viewInfo();
        mem2.name = "KH";
        mem2.password = "KKKKKK";
        mem2.viewInfo();
    }
}
