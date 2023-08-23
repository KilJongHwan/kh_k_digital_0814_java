package 영화표예매;

import 샘플프로그램.SampleClass;

import java.util.Scanner;

public class MovieTicket {
    // 좌석의 개수
    int[] seat = new int[10];   // 인스턴스 필드
    int price = 12000;
    // 판매된 좌석의 개수를 확인 총 판매 금액을 구해서 반환
    MovieTicket(){}
    MovieTicket(int price){
        this.price = price;
    }
    int totalAmount() {
        int cnt = 0; // 지역 변수
        for (int val : seat){   // val 변수는 seat 배열을 처음 부터 마지막 까지 순회 하는 요소
            if(val == 1) cnt++; // val이 1이면 판매된 좌석
        }
        return  cnt * price;    // 반환값이 int형
    }
    void printSeat(){   // 선택 가능한 좌석의 리스트 출력
        for (int s : seat) {
            if (s == 0) {
                System.out.print("[ ]");
            } else {
                System.out.print("[V]");
            }
            System.out.println();
        }
    }
    void selectSeat(){  // 좌석을 판매하는 메뉴
        printSeat();    // 좌석 상태 출력 메소드 호출
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석을 선택 하세요 : ");
        int selSeat = sc.nextInt(); // 유저가 선택한 좌석을 입력 받음 (유저는 1부터 생각)
        if (seat[selSeat - 1] == 0){
            seat[selSeat - 1] = 1;
            printSeat();
        }
        else {
            System.out.println("선택 하신 좌석은 이미 판매된 좌석 입니다.");
        }
    }
}
