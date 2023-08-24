package 상속TV;

public class PrototypeTV {
    boolean isPower;    // 전원값 저장
    int channel;        // 채널 정보 저장
    int volume;         // 볼륨 값 저장
    public PrototypeTV(){
        this.isPower = false;
        this.channel = 1;
        this.volume = 50;
    }
    // 생성자 오버로딩
    public PrototypeTV(boolean isPower, int channel, int volume){
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    public void setChannel(int channel){
        if (channel > 0 && channel < 1000){
            this.channel = channel;
        }else System.out.println("채널 설정 범위가 아닙니다.");
    }
}
