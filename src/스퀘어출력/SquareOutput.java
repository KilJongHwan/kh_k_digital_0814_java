package 스퀘어출력;
// input : 3
// Output
// 1 2 3
// 4 5 6
// 7 8 9

import java.util.Scanner;

public class SquareOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        for (int i = 0; i < 3; i++){
            for (int j = 1; j <= n; j++){
                System.out.printf("%3d", cnt);
                cnt++;
            }
            System.out.println();
        }
    }
}
