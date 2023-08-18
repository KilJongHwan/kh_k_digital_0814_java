package 숫자들의합문제;

import java.util.Scanner;

public class AllSum {
    public static void main(String[] args) {
        int N;
        String S;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.next();
        int sum = 0;
        for (int i = 0; i< N; i++){
            sum += S.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
