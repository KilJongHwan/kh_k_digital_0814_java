package 연산자;
// 산술연산자 : 사칙연산(+, -, *, /)과 나머지 연산자(%)

import java.util.Scanner;

public class OperateClass {
    public static void main(String[] args) {
        int num1 = 10, num2 = 2;
//        System.out.println("덧셈 : " + (num1 + num2));
//        System.out.println("뺼셈 : " + (num1 - num2));
//        System.out.println("곱셈 : " + (num1 * num2));
//        System.out.println("나눗셈 : " + ((double)num1 / num2));
//        System.out.println("나머지 : " + (num1 % num2));
//        System.out.println("몫 : " + (num1 / num2));
        // 대입 연산자 : 변수에 값을 대입하는 연산자( = ), 프로그램에서 = 대입의 의미
//        System.out.println(num1 += 2);  // 복합대입 연산자 : mum1 = num1 + 2;
//        System.out.println(num1 -= 2);  // 복합대입 연산자 : mum1 = num1 - 2;
//        System.out.println(num1 *= 2);  // 복합대입 연산자 : mum1 = num1 * 2;
//        System.out.println(num1 /= 2);  // 복합대입 연산자 : mum1 = num1 / 2;
        // 증감 연산자 : 단항연산자, 피연산자의 값을 1증가 또는 1감소 시키는 연산자
//        System.out.println(num1++);
//        int tmp = num1++;
//        System.out.println(tmp);
//        System.out.println(num1);
        // 비교 연산자 : 두개의 피연산자를 비교해서 어느쪼깅 큰지를 판단
        int x = 10;
        int y = 20;
        boolean rst1, rst2, rst3;
//        System.out.println(x > y);  // 거짓
//        System.out.println(x < y);  // 참
//        System.out.println(x == y);  // 거짓
//        System.out.println(x != y);  // 참
//        System.out.println(x >= y); // 거짓
//        System.out.println(x <= y); // 참
        // 논리 연산자 : && (AND 연산자 : 둘다 참인 경우) || (OR 연산자 : 둘중 하나가 참인 경우)
        // ! : NOT 연산자, 현재가 참이면 거짓, 거짓이면 참
//        rst1 = (x > 0) && (x > y);  // 거짓
//        rst2 = (x > 0) || (x > y);  // 참
//        rst3 = !((x > 0) || (x > y));  // 거짓
//        System.out.println(rst1 + " " + rst2 + " " + rst3);
        // 삼항연산자 : 3개의 피연산자를 필요로 하는 연산자,
//        Scanner sc = new Scanner(System.in);    // 키보드로 입력 받기 위한 객체 생성
//        System.out.print("나이를 입력하세요 : ");
//        int age = sc.nextInt();
//        boolean isAdult = (age > 19) ? true : false;
//        System.out.println(isAdult);
        // 문자열 결합 연산자
//        System.out.println("JAVA" + 15.04 + 3); // 문자열이 앞에 나오면 뒤에 따라오는항이 문자화
//        System.out.println(3 + 3.3 + "JSA");
        // 연산자 우선 순위 확인
        int val1 = 5;
        int val2 = 5;
        int val3 = 5;
        int result1, result2, result3;
        result1 = val1 + val2 * val3;
        result2 = (val1 + val2) * val3;
        result3 = val1 + (++val2) * val3;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}