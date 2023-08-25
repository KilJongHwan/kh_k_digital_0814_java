package 코코아톡;

import 인터페이스.NetworkAdapter;

public interface NetAdapter {
    void connect();
    void send(String msg);
}
class WiFi implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("Wi-Fi was connected");
    }
    @Override
    public void send(String msg){
        System.out.println("Wi-Fi >> " + msg);
    }
}
class FiveG implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("5G was connected");
    }
    @Override
    public void send(String msg){
        System.out.println("5G >> "+ msg);
    }
}
