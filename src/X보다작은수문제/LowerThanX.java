package X보다작은수문제;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 첫째 줄에  N X 입력
// X 보다 낮은 숫자를 출력

public class LowerThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 배열의 갯수
        int X = sc.nextInt();   // 기준값
        List<Integer> list = new ArrayList<>();
        List<Integer> lower = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt()); // 리스트 값 추가
            if (X > list.get(i)) lower.add(list.get(i));
        }
        for (int e : lower) System.out.print(e + " ");
    }
}
