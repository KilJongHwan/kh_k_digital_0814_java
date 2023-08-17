package 윤년계산;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
//        - 연도가 4로 나누어 떨어 진다.
//        - 400으로 나누어 떨어지면 윤년이다.
//        - 100으로 나누어 떨어지면 연도는 윤년이 아니다.
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요 : ");
        int year = sc.nextInt();
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println(year + " IS LEAP YEAR");
        }
        else{
            System.out.println(year + " IS NOT LEAP YEAR");
        }
    }
}