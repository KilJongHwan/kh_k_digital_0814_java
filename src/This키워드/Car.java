package This키워드;

public class Car {
    private  String model;  // 자동차 명
    private  int year;      // 출고 년도
    private  String color;  // 색상
    private  int maxSpeed;  // 최고 속도
    Car(){}
    Car(String model){
        this(model, 2022,"black",300);
    }
    Car(String model, int year, String color, int maxSpeed){    // this 포인터가 숨겨져 있다! 객체 내부의 주소를 반환!
        this.model = model;
        this.year = year;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
