package 클래스기본;

public class Student {
    // private 외부에서 해당 필드에 대한 접근 금지
    private int id;         // 학번, (필드)
    private String name;    // 이름
    private int grade;      // 학년
    private String addr;    // 주소

    public void setName(String name) {
        this.name = name;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }

    // 메소드
    public void showInfo(){
        System.out.println(name + ", " + addr);
    }
}
