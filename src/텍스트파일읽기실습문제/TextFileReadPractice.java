package 텍스트파일읽기실습문제;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class TextFileReadPractice {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("d:/temp/StudentGrade.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            TreeSet<Integer> set = new TreeSet<>();
            HashMap<String, Integer> map = new HashMap<>();
            Scanner sc = new Scanner(bis);
            String[] lines;
            int[] sum = new int[10];
            int i = 0;

            while (sc.hasNext()){
                String line = sc.nextLine();    // 문자엻 줄바꿈 기준으로 읽기
                //System.out.println(line);
                lines = line.split(" ");
                for (String e : lines){
                    if (isNumeric(e)){
                        sum[i] += Integer.parseInt(e);  // 0
                        set.add(Integer.parseInt(e));
                    }
                    else if (!isNumeric(e)){
                        map.put(e,sum[i]);
                        if (set.size() >= 2) {
                            i++;

                            set.clear();
                        }
                    }
                }
            }
            List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
            Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });
            System.out.println(entryList);



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
