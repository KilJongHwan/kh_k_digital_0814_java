package Vector클래스;
// ArrayList 구조와 메소드가 동일.
// 동기화가 지원되어 멀티 스레드 환경에 안전, 하지만 ArrayList 대비 성능이 떨어짐

import java.util.List;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("James", "yyyy@gmail.com", "010-1234-5678", "Lawyer"));
        list.add(new NameCard("Kane", "xxxx@gmail.com", "010-4444-3333", "None"));
        list.add(new NameCard("Philip", "zzzz@gmail.com", "010-6666-7777", "Actor"));

        for (NameCard n : list){
            System.out.println("Name : " + n.name );
            System.out.println("Mail : " + n.mail );
            System.out.println("Phone : " + n.phone );
            System.out.println("Job : " + n.jobs );
        }
    }
}
class NameCard{
    String name;
    String mail;
    String phone;
    String jobs;

    public NameCard(String name, String mail, String phone, String jobs) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.jobs = jobs;
    }
}
