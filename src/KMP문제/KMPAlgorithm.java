package KMP문제;

import java.util.Scanner;

public class KMPAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("-");
        for (int i = 0; i < s.length; i++){
            System.out.print(s[i].charAt(0));
        }
        System.out.println();
        char[] ch = sc.nextLine().toCharArray();
        for (int i = 0; i < ch.length; i++){
            if (ch[i] < 'a' && ch[i] != '-')
                System.out.print(ch[i]);
        }
    }
}
