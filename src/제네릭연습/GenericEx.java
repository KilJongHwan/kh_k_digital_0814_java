package 제네릭연습;

// 멀티타입 파라미터
public class GenericEx {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("James");
        System.out.println(p1.info);
        Person<Integer> p2 = new Person<>(123);
        System.out.println(p2.info);
        Product<String, Integer> pr1 = new Product<>();
        pr1.setName("Smart TV");
        pr1.setYear(2023);
        System.out.println(pr1.getName());
        System.out.println(pr1.getYear());

        Product<Integer, String> pr2 = new Product<>();
        pr2.setName(12345);
        pr2.setYear("2023");
        System.out.println(pr2.getName());
        System.out.println(pr2.getYear());
    }
}

class Product<T, M>{
    private T name;
    private M year;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getYear() {
        return year;
    }

    public void setYear(M year) {
        this.year = year;
    }
}
class Person <T>{
    public T info;
    Person(T info){
        this.info = info;
    }
}
