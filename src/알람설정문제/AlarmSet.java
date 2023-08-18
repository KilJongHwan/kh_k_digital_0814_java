package 알람설정문제;

import java.util.Scanner;

public class AlarmSet {
    public static void main(String[] args) {
        int H,M;
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        M = sc.nextInt();
        if(H > 0 && H <= 23 && M > 0 && M <= 59){
            int A = M - 45;
            if(A < 0){
                H--;
                M = 60 + A;
            }
            else{
                M = A;
            }
        }
        System.out.println(H + " : " + M);
    }
}
