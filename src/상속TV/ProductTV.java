package 상속TV;
// PrototypeTV 로 부터 상속을 받아 ProductTV 클래스를 만듦
public class ProductTV extends PrototypeTV{
    String name;
    boolean isInternet;
    ProductTV(){
        name = "Smart TV";
    }
    ProductTV(String name){
        isPower = false;
        channel = 10;
        volume = 30;
        isInternet = false;
        this.name = name;
    }
    void setPower(boolean isPower){
        this.isPower = isPower;
    }
    void setVolume(int volume){
        if(volume >= 0 && volume <= 100){
            this.volume = volume;
        }else System.out.println("볼륨 설정 범위를 벗어났습니다.");
    }
    // 오버라이딩 : 부모에게서 물려 받은 기능을 재정의 해서 사용하는 것
    @Override   // 어노테이션
    public void setChannel(int channel) {
        if (channel >= 1 && channel <= 2000){
            this.channel = channel;
            System.out.println("채널을 " + channel + "로 변경 되었습니다.");
        } else System.out.println("채널 설정 범위를 벗어났습니다.");
    }
    // 메소드 오버로딩 : 동일 이름의 메소드를 매개변수의 타입이나 개수로 구분하는 것
    public void setChannel(int channel, boolean isInternet){
        if (isInternet){
            System.out.println("인터넷 모드 입니다.");
            this.isInternet = true;
        }else {
            this.isInternet = false;
            if (channel > 1 && channel < 2000){
                this.channel = channel;
                System.out.println("채널을 " + channel + "변경 되었습니다.");
            } else System.out.println("채널 설정 범위를 벗어났습니다.");
        }
    }
    void watchTV(){
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷 : " + isInternet);

    }
}
