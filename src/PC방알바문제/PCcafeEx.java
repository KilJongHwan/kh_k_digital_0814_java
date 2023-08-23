package PC방알바문제;

import java.util.Scanner;
// 첫째 줄에 손님의 수 N이 주어진다. N은 100보다 작거나 같다.
// 둘째 줄에 손님이 들어오는 순서대로 각 손님이 앉고 싶어하는 자리가 입력으로 주어진다.
// 첫째 줄에 거절당하는 사람의 수를 출력한다.
public class PCcafeEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[101];
        int no = 0, S;

        for (int i = 1; i <= N; i++){
            S = sc.nextInt();
            if (A[S] != 0) no++;
            else A[S] = 1;
        }
        System.out.println(no);
    }
}
