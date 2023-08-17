package 제일큰정수문제;

import java.util.Scanner;

//세 자리의 정수를 입력 받아 가장 큰 수 출력
public class ThreeIntEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = x / 100;
        int b = (x / 10) % 10;
        int c = x % 10;
        int y = 0;
        if (a >= b && a >= c){
            y = a;
        } else if (b >= a && b >= c) {
            y = b;
        } else if (c >= a && c >= b) {
            y = c;
        }

        System.out.println("가장 큰 수는 " + y + "입니다.");
    }
}
