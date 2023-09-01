package 전자레인지문제;

import java.util.Scanner;

// 첫 번째 줄에는 요리시간 T(초)가 정수로 주어져 있으며 그 범위는 1 ≤ T ≤ 10,000 이다.
// T초를 위한 최소버튼 조작의 A B C 횟수를 첫 줄에 차례대로 출력해야 한다.
// 각각의 횟수 사이에는 빈 칸을 둔다. 해당 버튼을 누르지 않는 경우에는 숫자 0을 출력해야한다.
// 만일 제시된 3개의 버튼으로 T초를 맞출 수 없으면 음수 -1을 첫 줄에 출력해야 한다.

public class MicrowaveEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A,B,f ,m = 0 , t = 0;
        if (T > 0){
            f = T / 300;
            A = T % 300;
            if (A != 0){
                m = A / 60;
                B = A % 60;
                if (B  != 0) {
                    t = B / 10;
                    if (t % 10 != 0) {
                        System.out.println(-1);
                        System.exit(0);
                    }
                }
            }
            System.out.print(f + " " + m + " " + t);
        }else System.out.println(-1);
    }
}
