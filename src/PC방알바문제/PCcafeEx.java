package PC방알바문제;

import java.util.Scanner;

public class PCcafeEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[101];
        int no = 0;

        for (int i = 1; i <= N; i++){
           int S = sc.nextInt();
           if (A[S] != 0) no++;
           A[S] = 1;
        }
        System.out.println(no);
    }
}
