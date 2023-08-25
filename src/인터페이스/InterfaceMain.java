package 인터페이스;

import java.util.Scanner;

public class InterfaceMain {
    public static void main(String[] args) {
        NetworkAdapter networkAdapter;  // 완전 추상화가 적용된 인터페이스
        Scanner sc = new Scanner(System.in);
        System.out.println("Input connecting network [1]LAN [2]Wi-Fi [3]5G : ");
        int sel = sc.nextInt();
        switch (sel){
            case 1:
                networkAdapter = new LAN("KT Mega pass");
                networkAdapter.connect();
                break;
            case 2:
                networkAdapter = new WiFi("SK Telecom");
                networkAdapter.connect();
                break;
            case 3:
                networkAdapter = new FiveG("LG U+");
                networkAdapter.connect();
                break;
            default:
                System.out.println("No network for connecting");
        }
    }
}
