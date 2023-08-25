package 코코아톡;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CocoaTalk cocoaTalk = new CocoaTalk("James");
        cocoaTalk.writeMsg("What are you doing now?");
        NetAdapter adapter;
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose Net : [1]Wi-Fi [2]5G : ");
        int sel = sc.nextInt();
        if (sel == 1) adapter = new WiFi();
        else adapter = new FiveG();
        cocoaTalk.send(adapter);
    }
}
