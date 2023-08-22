package 요금제계산하기;
// 영식 요금제 : 30초당 10원 (30초가 되면 2통)
// 민식 요금제 : 50초당 15원
// 첫번째 줄에 통화의 횟수(통화 횟수는 20회 미만), 두번째 줄에 통화당 통화 시간(초단위)
// 출력은 싼 요금제를 출력 영식 요금제는 Y 60, 민식 요금제는 M 45
// 총 통화 요금이 같은 경우는 YM 총 통화요금 표시

import java.util.Scanner;

public class TollSystem {
    public static void main(String[] args) {
        int[] call = new int[20];
        int time;
        int Y= 0 , M=0;
        Scanner sc = new Scanner(System.in);
        time = sc.nextInt();
        for (int i = 0; i < time; i++){
            call[i] = sc.nextInt();
        }
        for (int i = 0; i < time; i++){
            Y += (call[i] / 30 ) * 10 + 10;
            M += (call[i] / 50 ) * 15 + 15;
        }
        if (Y > M) System.out.println("M" + M);
        else if (Y == M) System.out.println("Y" + Y + " " + M + "M");
        else System.out.println("Y" + Y);
    }
}
