package 행사안내메일문제;

import java.util.Scanner;
//1. 사용자로부터 이름, 제목, 날짜, 시간 정보를 입력받습니다.
//2. 입력된 날짜의 월을 추출하여 해당하는 계절을 판단합니다. (20230314)
//3. 계절에 따라 적절한 인사말과 입력된 일정 정보를 출력합니다.

//프로그램은 다음과 같은 방식으로 동작해야 합니다.

//- 1월부터 12월까지의 월 정보를 입력 받습니다.
//- 입력된 월에 따라 다음과 같은 계절 정보를 출력합니다.
//    - 12월, 1월, 2월 → "한파의 연속인 1월 입니다."
//    - 3월 → "봄의 기운이 느껴지는 3월 입니다."
//    - 4월 → "새싹이 피어나는 4월 입니다."
//    - 5월 → "계절의 여왕 5월 입니다."
//    - 6월 → "활동하기 좋은 6월 입니다."
//    - 7월 → "휴가가 기다려지는 7월 입니다."
//    - 8월 → "무더운 8월 입니다."
//    - 9월 → "선선한 9월 입니다."
//    - 10월 → "천고마비의 계절 10월 입니다."
//    - 11월 → "쓸쓸한 늦가을 11월 입니다."
//- 입력된 이름, 제목, 일시, 시간 정보와 계절 정보를 이용하여 다음과 같은 형식으로 일정 정보를 출력합니다.
public class EventInfoMail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        System.out.print("제목을 입력하세요 : ");
        String title = sc.next();
        System.out.print("날짜를 입력하세요 : ");
        String ym = sc.next();
        System.out.print("시간을 입력하세요 : ");
        String time = sc.next();
        if(ym.length() > 8){
            System.out.println("날짜범위를 넘어갔습니다.");
        }
        else{
            String a = ym.substring(4,6);
            System.out.println("이름 : " + name + "제목 : "+ title + "날짜 : " + ym + "시간 : " + time);
            int month = Integer.parseInt(a);
            switch (month){
                case 12:
                case 1:
                case 2:
                    System.out.println("한파의 연속인 " + month + "월 입니다.");
                    break;
                case 4:
                    System.out.println("새싹이 피어나는 4월 입니다");
                    break;
                case 5:
                    System.out.println("계절의 여왕 5월 입니다.");
                    break;
                case 6:
                    System.out.println("활동하기 좋은 6월 입니다.");
                    break;
                case 7:
                    System.out.println("휴가가 기다려지는 7월 입니다");
                    break;
                case 8:
                    System.out.println("무더운 8월 입니다.");
                    break;
                case 9:
                    System.out.println("선선한 9월 입니다.");
                    break;
                case 10:
                    System.out.println("천고마비의 계절 10월 입니다");
                    break;
                case 11:
                    System.out.println("쓸쓸한 늦가을 11월 입니다.");
                    break;
                default:
                    System.out.println("잘못된 날짜를 입력되서 오류가 발생하였습니다");
                    break;
            }
        }

    }
}
