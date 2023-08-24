package 매개변수와다형성2;

public class Vehicle {
    public void run(){
        System.out.println("차량이 달립니다.");
    }
}
class Bus extends Vehicle{
    @Override
    public void run() {
        System.out.print("버스가 달립니다.");
    }
}
class SportsCar extends Vehicle{
    @Override
    public void run() {
        System.out.print("스포츠 카가 달립니다.");
    }
}
class Taxi extends Vehicle{
    @Override
    public void run() {
        System.out.print("텍시가 달립니다.");
    }
}