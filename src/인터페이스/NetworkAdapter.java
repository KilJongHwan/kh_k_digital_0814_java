package 인터페이스;

public interface NetworkAdapter {
    void connect(); // 자동으로 public abstract 포함
}

// 유선 인터넷
class LAN implements NetworkAdapter{
    String company;
    LAN(String company){
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " LAN was connected");
    }
}
class WiFi implements NetworkAdapter{
    String company;
    WiFi(String company){
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + " Wi-Fi was connected");
    }
}
class FiveG implements NetworkAdapter{
    String company;
    FiveG(String company){
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + " 5G was connected");
    }
}