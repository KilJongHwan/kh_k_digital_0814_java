package 아이패드만들기;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class IPadPro {
    int screen; // 11inch , 12.9inch
    int color;  // Space gray, Silver
    int memory; // 128GB, 256GB, 512GB, 1TB
    int network; // Wi-Fi only, Wi-Fi + Cellular
    String name; // 각인 서비스 시 이름 저장
    String productDate; // 제품 생산 일자
    String serialNum;   // 제품 일련 번호 : 제품 고유값
    static int cnt = 0; // 클래스 소속의 변수, 몇대가 생산 되었는지 확인하는 용도, 즉 클래스가 객체로 만들어진 횟수
    IPadPro(String name){
        this.name = name;
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        productDate = sdf.format(now);  // 생산한 년/월/일을 가져 옴
        cnt++;
        productDate += cnt; // 문자열에 생산대 수를 이어 붙이기
    }
    boolean continueOrder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(5) + "iPad Pro 구입하기" + "=".repeat(5));
        System.out.println("구입하시려면 yes / 종료는 quit : ");
        String isContinue = sc.next();
        return isContinue.equalsIgnoreCase("yes");  // 구입을 진행 하겠냐 안 하겠냐
    }
    // 화면 사이즈 정하기
    void setScreen(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("display 선택 [1] 11inch [2] 12.9inch : ");
            screen = sc.nextInt();
            if (screen == 1 || screen == 2) return;
            System.out.println("display를 다시 선택 하세요.");
        }
    }
    void setColor(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("color 선택 [1] Space Gray [2] Silver : ");
            color = sc.nextInt();
            if (color == 1 || color == 2) return;
            System.out.println("color를 다시 선택 하세요.");
        }
    }
    void setMemory(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Capacity 선택 [1] 128GB [2] 256GB [3] 512GB [4] 1TB : ");
            memory = sc.nextInt();
            if (memory == 1 || memory == 2 || memory == 3 || memory == 4) return;
            System.out.println("Capacity룰 다시 선택 하세요.");
        }
    }
    void setNetwork(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Network 선택 [1] Wi-Fi [2] Wi-Fi + Cellular : ");
            network = sc.nextInt();
            if (network == 1 || network == 2) return;
            System.out.println("network를 다시 선택 하세요.");
        }
    }
    void setName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("각인 서비스를 신청 하시겠습니까? (yes / no) : ");
        String service = sc.next();
        if (service.equalsIgnoreCase("yes")){
            System.out.print("이름을 입력 하세요 : ");
            name = sc.next();
        }
    }
    void setSerialNum(){
        String screenStr = (screen == 1) ? "11" : "13";
        String[] memStr = {"", "128","256","512","1024"};
        String networkStr = (network == 1) ? "W" : "C";
        serialNum = "iPad" + screenStr + memStr[memory] + networkStr + productDate; // 일련번호 생성
    }
    void progressPad() throws InterruptedException {
        int count = 0;
        while (true){
            sleep(300);
            count++;
            System.out.print(" << iPad_Pro is Making : [" + count + "%] >>");
            System.out.print("\r");
            if (count >= 100) break;
        }
    }
    void productPad(){
        final String[] screenType = {"", "11inch","12.9inch"};
        final String[] colorType = {"", "Space Gray", "Silver"};
        final String[] memType = {"", "128GB", "256GB", "512GB", "1TB"};
        final String[] netType = {"", "Wi-Fi", "Wi-Fi + Cellular"};
        System.out.println("=".repeat(5)+"iPad Pro Spec" + "=".repeat(5));
        System.out.println("Display : " + screenType[screen]);
        System.out.println("Color : " + colorType[color]);
        System.out.println("Capacity : " + memType[memory]);
        System.out.println("Network : " + memType[network]);
        System.out.println("Name : " + name);
        System.out.println("Serial Number : " + serialNum);
        System.out.println("-".repeat(40));
    }
}
