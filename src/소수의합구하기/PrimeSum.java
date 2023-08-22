package 소수의합구하기;

import java.util.Scanner;

// 입력 받은 정수 미만의 소수의 합을 구하는 함수를 만드세요.
// 예) 12이면 2+3+5+7+11 = 28
// 소수란? 1과 자기 자신 이외의 자연수로 나누어지지 않는 수
public class PrimeSum {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int sum = 0;

        for (int i = 2; i <= N; i++){
            sum += prime(i);
        }
        System.out.println(sum);
    }
    static int prime(int s){
        int result = 0;
        boolean t = true;
        for (int i = 2; i < s; i++){
            if (s % i == 0) t = false;
        }
        if (t) result = s;
        return result;
    }
}
