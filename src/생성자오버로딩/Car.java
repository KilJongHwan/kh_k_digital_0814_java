package 생성자오버로딩;

public class Car {
    String company = "Hyundai";
    String model;
    String color;
    int speed;
    int horsePower;
    Car(){}
    Car(String model){
        this.model = model;
    }
    Car(String model, String color){
        this.model = model;
        this.color = color;
    }
    Car(String model, String color, int speed){
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    Car(String model, String color, int speed, int horsePower){
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.horsePower = horsePower;
    }
    Car(String company, String model, String color, int speed, int horsePower){
        this.company = company;
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.horsePower = horsePower;
    }
    public void carInfo(){
        System.out.println(company);
        System.out.println(model);
        System.out.println(color);
        System.out.println(speed);
        System.out.println(horsePower);
    }
}
