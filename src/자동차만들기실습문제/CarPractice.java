package 자동차만들기실습문제;

import java.util.Scanner;

public class CarPractice {
    public static void main(String[] args) {
        SportsCar car1 = new SportsCar(250, 8, 2, "Ferrari", 2000, 30);
        Sedan car2 = new Sedan(200, 12, 4, "Audi", 2000, 45);
        Bus car3 = new Bus(150, 5, 20, "Bus", 2000, 100);
        Scanner sc = new Scanner(System.in);
        Car car = null;
        System.out.print("이동 지역을 선택 하세요 (1. 부산, 2. 대전, 3. 강릉, 4. 광주) : ");
        int sel = sc.nextInt();

        System.out.print("이동할 승객 수를 입력 하세요 ( 1 ~ 100 사이) : ");
        int sel2 = sc.nextInt();

        System.out.print("이동 차량을 선택 하세요. (1. 스포츠카, 2.승용차, 3번 버스) : ");
        int sel3 = sc.nextInt();
        System.out.print("부가 기능의 ON/OFF 를 선택 하세요. [1]ON [2]OFF : ");
        int sel4 = sc.nextInt();
        switch (sel3){
            case 1:
                car = car1;
                break;
            case 2:
                car = car2;
                break;
            case 3:
                car =car3;
                break;
            default:
                System.out.println("짤못 입력 하셧습니다.");
                break;
        }
        switch (sel){
            case 1:
                car.setDis(400);
                break;
            case 2:
                car.setDis(200);
                break;
            case 3:
                car.setDis(150);
                break;
            case 4:
                car.setDis(300);
                break;
        }
        if (sel4 == 1) car.setMode();

        if (sel2 > 0  && sel2 <= 100){
            car.setInput(sel2);
            car.CarInfo();
        }

    }
}