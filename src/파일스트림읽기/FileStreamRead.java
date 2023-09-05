package 파일스트림읽기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStreamRead {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/파일스트림읽기/asdf.txt");
        } catch (FileNotFoundException e){
            System.out.println("읽을 파일을 찾지 못했습니다.");
        }
        Scanner sc = new Scanner(inputStream);
        while (sc.hasNext()){ // 읽을 내용이 있다면 참
            String line = sc.nextLine();    // 문자엻 줄바꿈 기준으로 읽기
            System.out.println(line);
        }
    }
}
