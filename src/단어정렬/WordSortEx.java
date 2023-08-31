package 단어정렬;
// 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램 작성
// n의 개수를 먼저 입력 받고
// 1. 길이가 짧은 것부터
// 2. 길이가 같으면 사전 순으로
// 3. 중복 제거

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSortEx {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;
                else if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                return -1;
            }
        });
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            ts.add(sc.next());
        }
        for (String e : ts) System.out.print(e + " ");
    }
}
