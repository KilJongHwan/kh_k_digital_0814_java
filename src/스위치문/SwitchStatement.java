package 스위치문;

import java.util.Scanner;

// 조건에 조건식이 올 수 없고 조건의 값이 들어옴
// 조건값에는 정수, 문자, 문자열이 올 수 있음
// 장점은 if문에 비해서 가독성이 좋음, 성능이 약간 좋음
// 단점은 조건식이나 범위가 올 수 없음
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력하세요 : ");
        String season = sc.next();
        switch (season){
            case "spring":
            case "SPRING":
                System.out.println("season is spring");
                break;
            case "summer":
            case "SUMMER":
                System.out.println("season is summer");
                break;
            case "fall":
            case "FALL":
            case "autumn":
                System.out.println("season is fall");
                break;
            case "winter":
            case "WINTER":
                System.out.println("season is winter");
                break;
            default:
                System.out.println("not season plz input season");
                break;
        }
    }
}