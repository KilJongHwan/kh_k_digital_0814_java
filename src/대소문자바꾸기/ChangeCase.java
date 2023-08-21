package 대소문자바꾸기;

import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            if(ch[i] < 'a') System.out.print((char) (ch[i] + ('a' - 'A')));
            else  System.out.print((char) (ch[i] - ('a' - 'A')));
        }
    }
}
