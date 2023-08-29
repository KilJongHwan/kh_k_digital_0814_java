package 디폴트메소드;

import java.util.Scanner;

public class DefaultMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose Product [1]Audio [2]TV : ");
        int sel = sc.nextInt();
        RemoteControl rc;
        if (sel == 1){
            rc = new Audio();
            rc.turnON();
            rc.setVolume(20);
            rc.setMute(true);
            RemoteControl.changeBattery();
        }else {
            rc = new Television();
            rc.turnON();;
            rc.setVolume(30);
            rc.setMute(false);
        }
        RemoteControl playStation = new RemoteControl() {
            @Override
            public void turnON() {
                System.out.println("playStation ON");
            }

            @Override
            public void turnOff() {
                System.out.println("playStation OFF");
            }

            @Override
            public void setVolume(int vol) {

            }
        };
        playStation.turnON();
        playStation.turnOff();
    }
}
