package 다운캐스팅;

import java.util.ArrayList;
import java.util.List;

// 상위클래스형으로 변환 되었던 하위 클래스를 다시 원래 자료형으로 변환하는 것
public class DownCasting {
    List<Animal> animalList = new ArrayList<>();
    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();
        downCasting.addAnimal();
        System.out.println();
        downCasting.testCasting();
    }
    public void addAnimal(){
        animalList.add(new Animal());
        animalList.add(new Human());
        animalList.add(new Tiger());
        animalList.add(new Eagle());
        for (Animal ani : animalList){
            ani.move();
        }
    }
    public void testCasting(){
        for (int i = 0; i < animalList.size();i++){
            Animal ani = animalList.get(i); // 업 캐스팅
            if (ani instanceof Human){  // Human형으로 다운 캐스팅 가능 한지 확인
                Human h = (Human) ani;
                h.readBook();   // 원래 자기 자신의 클래스에 대한 참조 변수 이기 때문에 접근 가능 함
            }else if(ani instanceof  Tiger){
                Tiger t = (Tiger) ani;
                t.hunting();
            } else if (ani instanceof Eagle){
                Eagle e = (Eagle) ani;
                e.fly();
            }else {
                System.out.println("지원되지 않는 형 입니다.");
            }
        }
    }
}
