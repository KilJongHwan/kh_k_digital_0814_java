package Hash셋객체비교;

import java.util.HashSet;
import java.util.Objects;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        Member member1 = new Member(1001, "Uni");
        Member member2 = new Member(1002, "Jessy");
        Member member3 = new Member(1003, "Soo");
        Member member4 = new Member(1003,"Bob");
        // 중복이 아님, 인스턴스 주소가 달라서 hashCode가 다르다
        hashSet.add(member1);
        hashSet.add(member2);
        hashSet.add(member3);
        hashSet.add(member4);
        for (Member m : hashSet) m.showMember();
    }
}

class Member{
    int id;
    String name;
    @Override
    public int hashCode(){
        return  id;
    }
    @Override
    public  boolean equals(Object obj){
        if (obj instanceof Member){ // 다운캐스팅이 성립하는지 확인하기 위한 조건
            Member member = (Member) obj;   // 원래 형변환
            if (this.id == member.id) return  true; // id가 같으면 중복이라고 판별
            else return false;
        }
        return  false;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void showMember(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    }
}