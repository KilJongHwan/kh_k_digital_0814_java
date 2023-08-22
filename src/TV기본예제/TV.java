package TV기본예제;

import javax.swing.*;

public class TV {
    private boolean isON;  // TV 전원
    private int channel;   // 채널
    private int volume;    // 볼륨

    TV(){
        isON = false;
        channel = 11;
        volume = 10;
        System.out.println("전원 : " + isON + ", 채널 : " + channel + ", 볼륨 : " + volume);
    }
    TV(boolean isON, int channel, int volume){
        this.isON = isON;
        this.channel = channel;
        this.volume = volume;
        System.out.println("전원 : " + isON + ", 채널 : " + channel + ", 볼륨 : " + volume);
    }

    public void setON(boolean isON) {
        this.isON = isON;
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("TV 전원 " + onOffStr);
    }

    public void setChannel(int channel) {
        if (channel >= 1 && channel <= 999){
            this.channel = channel;
            System.out.println("채널을 " + this.channel + "로 변경하였습니다.");
        }
        else {
            System.out.println("채널 설정값이 허용 범위를 벗어났습니다 채널 번호를 확인해주세요.");
        }
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100){
            this.volume = volume;
            System.out.println("볼륨을 " + volume + "변경하였습니다.");
        }
        else {
            System.out.println("볼륨 설정값이 허용 범위를 벗어났습니다. 볼륨을 확인해주세요");
        }
    }

    public void getInfoTV() {
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("=".repeat(5) + "TV 정보" + "=".repeat(5));
        System.out.println("전원 : " + onOffStr);
        System.out.println("볼륨 : " + volume);
        System.out.println("채널 : " + channel);
    }
}
