package 제네릭연습2;

public class GenericPrint<T> {
    private T material; // T 자료형 변수 선언
    public void setMaterial(T material){
        this.material = material;
    }
    public T getMaterial(){
        return material;
    }
    public String toString(){
        return material.toString();
    }
}
class Powder {
    public void doPrinting(){
        System.out.println("Powder 재료로 출력 합니다.");
    }
    public String toString(){
        return "재료는 powder 입니다.";
    }
}
class Plastic {
    public void doPrinting (){
        System.out.println("Plastic 재료로 출력 합니다.");
    }
    public String toString(){
        return  "재료는 plastic 입니다.";
    }
}
