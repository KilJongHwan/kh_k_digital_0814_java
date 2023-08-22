package 더하기싸이클문제;

import java.util.Scanner;

public class PlusCycle {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int count = 0;
        int prevSum = N;
        int divSum = 0;
        int newN = 0;
        while (true){
            count++;
            divSum = (prevSum / 10) + (prevSum % 10);
            newN = (prevSum % 10) * 10 + (divSum % 10);
            if (newN == N) break;
            prevSum = newN;
        }
        System.out.println(count);
    }
}
