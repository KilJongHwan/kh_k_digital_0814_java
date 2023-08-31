package Comparable기본;

import java.util.TreeSet;

// Comparable / Comparator : 클래스에 대한 정렬을 구현 할 수 있도록 해주는 인터페이스
public class ComparableEx {
    public static void main(String[] args) {
        TreeSet<CarComp> list = new TreeSet<>();
        list.add(new CarComp("Audi", 2017, "white"));
        list.add(new CarComp("Hyundai", 2017, "red"));
        list.add(new CarComp("Honda", 2013, "violet"));
        list.add(new CarComp("Bents", 2013, "black"));
        list.add(new CarComp("BMW", 2020, "grey"));
        for (CarComp e : list) {
            System.out.println("Name : " + e.modelName);
            System.out.println("Year : " + e.modelYear);
            System.out.println("Color : " + e.color);
            System.out.println();
        }
    }
}
