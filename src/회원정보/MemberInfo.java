package 회원정보;

import java.util.Scanner;

// 이름 : 문자열
// 나이 : 정수, 나이는 1 ~ 199를 정상 입력으로 간주하고 이외의 값이 오면 재 입력 요구
// 성별 : 문자 'M' 과 'F'로 입력 받고 출력은 "Male"과 "Female"으로 출력
// 직업 : 정수로 입력 (1. 학생, 2.회사원, 3. 주부, 4.무직), 1~4 이외의 값이 오면 재 입력 요구
public class MemberInfo {
    String name;    // 인스턴스 필드
    int age;
    char gender;
    int jobs;
    Scanner sc = new Scanner(System.in);
    public void setName(){
        System.out.print("이름을 입력 하세요 : ");
        name = sc.nextLine();
    }
    public void setAge(){
        while (true){
            System.out.print("나이를 입력 하세요 : ");
            age = sc.nextInt();
            if (age > 0 && age < 200) return; // 더 빨리 루프를 끝낼 수 있음
            System.out.println("나이를 잘못 입력 하셨습니다.");
        }
    }
    public void setGender(){
        while (true){
            System.out.print("성별을 입력 하세요 : ");
            gender = sc.next().charAt(0);
            switch (gender){
                case 'M':
                case 'm':
                case 'F':
                case 'f':
                    return;
                default:
                    System.out.println("성별을 잘 못 입력 하셨습니다.");
            }
        }
    }
    public void setJobs(){

    }
}