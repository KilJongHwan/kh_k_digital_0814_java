package KMP문제;

import java.util.Scanner;
// - 첫 번째는 성을 모두 쓰고, 이를 하이픈(-)으로 이어 붙인 것이다. 예를 들면, Knuth-Morris-Pratt이다. 이것을 긴 형태라고 부른다.
// - 두 번째로 짧은 형태는 만든 사람의 성의 첫 글자만 따서 부르는 것이다. 예를 들면, KMP이다.
// 입력은 한 줄로 이루어져 있고, 최대 100글자의 영어 알파벳 대문자,
// 소문자, 그리고 하이픈 ('-', 아스키코드 45)로만 이루어져 있다.
// 첫 번째 글자는 항상 대문자이다. 그리고, 하이픈 뒤에는 반드시 대문자이다.
// 그 외의 모든 문자는 모두 소문자이다.
public class KMPAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        String[] s = name.split("-");
        for (int i = 0; i < s.length; i++){
            System.out.print(s[i].charAt(0));
        }
        System.out.println();

        char[] ch = name.toCharArray();
        for (int i = 0; i < ch.length; i++){
            if (ch[i] < 'a' && ch[i] != '-')
                System.out.print(ch[i]);
        }
        System.out.println();

        for (int i = 0; i < name.length(); i++){
            if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') System.out.print(name.charAt(i));
        }
        System.out.println();

        for (int i = 0; i < name.length(); i++){
            if (i == 0) System.out.print(name.charAt(i));
            else {
                if (name.charAt(i) == '-') System.out.print(name.charAt(i+1));
            }
        }
    }
}
