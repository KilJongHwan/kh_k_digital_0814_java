package 별찍기문제;

import java.util.Scanner;

// 삼각형 별찍기
// 입력 받은 수만큼 별찍기
// 5를 입력 하면
// *
// * *
// * * *
// * * * *
// * * * * *
public class StarInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for (int i = 0; i <cnt; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
