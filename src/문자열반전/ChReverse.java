package 문자열반전;
// 문자열을 입력 받음 : abcd -> dcba
import java.util.Scanner;

public class ChReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        for (int i = S.length() - 1; i >= 0; i--){
            System.out.print((S.charAt(i)));
        }
    }
}