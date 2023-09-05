package 텍스트파일읽기실습문제;

import javax.swing.text.Style;
import java.awt.*;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

public class TextFileReadPractice {
    public static void main(String[] args) {

        try{
            FileInputStream fis = new FileInputStream("src/텍스트파일읽기실습문제/StudentGrade.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            Scanner sc = new Scanner(bis);
            HashMap<String, Integer> map = new HashMap<>();
            List<Integer> set = new ArrayList<>();
            List<Integer> get = new ArrayList<>();
            String[] lines;
            int sum = 0;
            int cnt = 2;    // 처음 과목수
            int i = 0;

            while (sc.hasNext()){
                String line = sc.nextLine();    // 문자엻 줄바꿈 기준으로 읽기
                lines = line.split(" ");
                for (String e : lines){
                    if (isNumeric(e))
                        set.add(Integer.parseInt(e));
                }
                while (true) {
                    sum += set.get(i);
                    if (i == cnt){
                        get.add(sum);
                        map.put(lines[0], sum);
                        cnt += 3;
                        sum = 0;
                    }
                    i++;
                    if (get.size() == set.size() / 3) break;
                }

            }
            List<String> listKeySet = new ArrayList<>(map.keySet());
            Collections.sort(listKeySet, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));
            get.sort(Collections.reverseOrder());
            System.out.println("=".repeat(5) + "내림 차순 정렬" + "=".repeat(5));
            for (int j = 0; j < 10; j++){
                System.out.println("[이름]" + listKeySet.get(j) + " " + "[총 점수]" + get.get(j));
            }

        } catch (IOException e) {
            System.out.println("파일이 없습니다.");
        }
    }

    static boolean isNumeric(String n) {
        if (n == null) return false;
        try {
            double d = Double.parseDouble(n);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
