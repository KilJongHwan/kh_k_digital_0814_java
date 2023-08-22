package 대소문자바꾸기;

import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            if(ch[i] < 'a') System.out.print((char) (ch[i] + ('a' - 'A'))); // 문자 배열이 대문자면 소문자와 대문자 차이값을 더하고
            else  System.out.print((char) (ch[i] - ('a' - 'A')));   // 소문자라면 빼서 차이값만큼 줄여서 서로 바꾼다
        }
    }
}