package 상속기본;

public class Animal {
    String name;
    void setName(String name){
        this.name = name;
    }
}
// Animal 을 상속 받아 클래스를 만듦
class Dog extends Animal{
    void sleep(){
        System.out.println(this.name + " was slept");
    }
}
class HouseDog extends Dog{
    void sleep(){
        System.out.print(this.name + " was slept in House");
    }
    void sleep(int hour){
        System.out.println(this.name + " was sleeping in House for " + hour + " hours");
    }
}