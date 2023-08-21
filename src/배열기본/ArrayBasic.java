package 배열기본;

import java.util.Arrays;

// 자바의 배열은 동일한 데이터 요소들을 연속적으로 저장하는 자료 구조
// 인덱스를 사용해서 각 요소를 접근 할 수 있다. (인덱스 0부터 시작)
// 배열은 크기를 먼저 지정 해야 한다.
// 타입[] 배열이름 = new 타입[배열길이];
public class ArrayBasic {
    public static void main(String[] args) {
        int[] grade1 = new int[3];  // 힙 영역에서 정수 3개를 저정할 메모리 공간을 확보
        grade1[0] = 85;
        grade1[1] = 99;
        grade1[2] = 77;
//        grade1[3] = 31;

//        for (int i = 0; i < grade1.length; i++){
//            System.out.println(grade1[i]);
//        }
//        for(int a : grade1){
//            System.out.println(a + " ");
//        }
//        int[] odd = {1,3,5,7,9};    // 이미 정해진 값을 배열에 대입하는 경우는 크기와 new를 사용하지 않아도 됨
//        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
        int[] grade2 = {88, 99, 56};    // 이미 값을 알고 있는 경우
        int[] grade3 = new int[] {99 , 88 , 88};
        int[] grade4; // 객체 타입의 참조 변수 이므로 실제 객체의 주소를 받아야 함
        grade4 = new int[4];
        grade4[0] = 100;
        grade4[1] = 88;
        grade4[2] = 77;
        grade4[3] = 55;
        int sum =0;
        for (int a:grade4) {
            a += 10;
            System.out.println(a + " ");
            sum += a;
        }
        System.out.println("총점은 : " + sum);
        System.out.printf("평균은 : %.2f\n", (double)sum / grade4.length);
        sum = 0;
        for (int i = 0; i < grade4.length; i++){
            System.out.println(grade4[i] + " ");
            sum += grade4[i];
        }
        System.out.println("총점은 : " + sum);
        System.out.printf("평균은 : %.2f\n", (double)sum / grade4.length);    }
}