package 시험성적문제;

import java.util.Scanner;

//시험 성적을 입력 받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지는 F를 출력하는 프로그램
// 0 ~ 100 사이가 아니면 성적이 잘못 입력 되었다고 출력
public class TestEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("시험 점수를 입력 하세요 : ");
            int score = sc.nextInt();
            if(score <= 0 || score >= 100) continue;
                if (90 <= score)
                    System.out.println(score + "점은 A 입니다.");
                else if (80 <= score)
                    System.out.println(score + "점은 B 입니다.");
                else if (70 <= score)
                    System.out.println(score + "점은 C 입니다.");
                else if (60 <= score)
                    System.out.println(score + "점은 D 입니다.");
                else
                    System.out.println(score + "점은 F 입니다");
                break;
        }
    }
}
