package While반복문2;

import java.util.Scanner;

// 반복 횟수를 알 수 없는 경우 대한 예제
// do - while : 한번은 무조건 수행하고 조건을 물어 봄
public class WhileStatement2 {
    public static void main(String[] args) {
        int age;
//        Scanner sc = new Scanner(System.in);
//        while(true){    // 무한 루프 (반드시 탈출 조건이 필요)
//            System.out.print("나이를 입력 하세요 : ");
//            age = sc.nextInt();
//            if(age > 0 && age < 200) break; //1~199 사이만 정상적으로 입력된 나이로 간주
//            System.out.println("나이를 잘못 입력하셨습니다.");
//        }
        do {
            System.out.print("나이를 입력 하세요 : ");
            Scanner sc = new Scanner(System.in);
            age = sc.nextInt();
        }while (age <= 0 || age >= 200);

        System.out.println("입력하신 나이는 " + age + "입니다.");
    }
}