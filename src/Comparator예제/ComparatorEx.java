package Comparator예제;

import java.util.TreeSet;

// 두개의 메소드를 비교하는 방법
public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Fruit> set = new TreeSet<>(new DescendingComparator().reversed()); // 생성자 정렬 조건을 갖는 객체
        set.add(new Fruit("Grape",3000));
        set.add(new Fruit("Mango",10000));
        set.add(new Fruit("Strawberry",6000));
        for (Fruit f : set){
            System.out.println("Fruit Name : " + f.name + " Price : " + f.price);
        }
    }
}
