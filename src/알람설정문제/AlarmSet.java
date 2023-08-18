package 알람설정문제;

import java.util.Scanner;

public class AlarmSet {
    public static void main(String[] args) {
        int H,M;
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        M = sc.nextInt();
        int totalMin = H * 60 + M;
        if (totalMin < 45){
            totalMin = 24 * 60 + totalMin;
        }
        totalMin -= 45;
        System.out.println((totalMin / 60) + " : " + (totalMin % 60));
        if(H >= 0 && H <= 23 && M >= 0 && M <= 59){
            int A = M - 45;
            if(A < 0){
                H--;
                M = 60 + A;
                if(H < 0){
                    H = 23;
                }
            }
            else
                M = A;
        }
        else{
            M %= 60;
            H++;
        }
        System.out.println(H + " : " + M);
    }
}
