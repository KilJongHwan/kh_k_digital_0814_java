package 정수나누어담기;

import java.util.Scanner;

public class ExampleTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("100의 자리 정수 입력 : ");
        int num = sc.nextInt();
        int a = num / 100;  // 100으로 나눈 몫 = 백의 자리
        int b = (num % 100) / 10;   // 100으로 나눈 나머지 = 100의 자리를 제외한 값을 10의 자리로 나눈값 = 10의 자리만 남는다
        int c = num % 10;   // 10으로 나눈 나머지는 1의 자리값만 남게 된다
        System.out.println("100의 자리 : " + a + "\n10의 자리 : " + b + "\n1의 자리 : " + c);

    }
}
