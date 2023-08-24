package 나머지문제;

import java.util.Scanner;

// 10개의 수를 입력 받은 뒤, 이를 42로 나눈 나머지
// 나머지 중 서로 다른 값이 몇개?
// 숫자 10개 연속 받음

public class RestSolution {
    public static void main(String[] args) {
        int[] N = new int[42];
        int input;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            input = sc.nextInt();
            N[input % 42] = 1;
        }
        for (int i = 0; i < N.length; i++){
            if (N[i] == 1) sum++;
        }

        System.out.println(sum);
    }
}
