package 에어컨만들기;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException{
        AirCon samsungAirCon = new AirCon();
        int elapsedTime = 0;    // 경과 시간을 계산하기 위한 변수
        boolean isSetTemp = false;  // 온도를 변경할 조건 인지 판단
        Scanner sc = new Scanner(System.in);
        System.out.print("에어컨을 전원을 입력하세요 (ON/OFF) : ");
        String isOn = sc.next();
        if (isOn.equalsIgnoreCase("ON")){
            samsungAirCon.setPower(true);
            samsungAirCon.setAirConState();
            while(true){
                sleep(1000);
                elapsedTime++;
                switch (samsungAirCon.getWindStep()){
                    case 1: if (elapsedTime >= 60) isSetTemp = true; break;// 1단
                    case 2: if (elapsedTime >= 30) isSetTemp = true; break;// 2단
                    case 3: if (elapsedTime >= 20) isSetTemp = true; break;// 3단
                    default: if (elapsedTime >= 61) isSetTemp = true;
                }
                if (isSetTemp){
                    if (samsungAirCon.isHeater()) samsungAirCon.setCurrTemp(1);
                    if (samsungAirCon.isCooler()) samsungAirCon.setCurrTemp(-1);
                    samsungAirCon.airConInfo();
                    isSetTemp = false;  // 온도 변경 이후 초기화
                    elapsedTime = 0;    // 온도 변경 이후 초기화
                }
                if (samsungAirCon.getCurrTemp() == samsungAirCon.getSetTemp()){
                    System.out.println("에어컨을 종료 합니다.");
                    break;
                }
            }
        }
    }
}
