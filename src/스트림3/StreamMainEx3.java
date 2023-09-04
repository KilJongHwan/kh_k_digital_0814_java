package 스트림3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// Files 의 정적 메소드인 lines()의 BufferedReader
// line() 메소드를 이용하여 문자 파일의 내용을 Stream 을 통해 행 단위 로 읽고 콘솔에 출력
public class StreamMainEx3 {
    public static void main(String[] args) throws IOException {
        // 파일 내용울 소스로하는 Stream 생성
        Path path = Paths.get("src/스트림3/test.txt");
        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(System.out::println);
        System.out.println();

        // BufferedReader 의 Line() 메소드 이용
        File file = path.toFile();
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        stream = br.lines();
        stream.forEach(System.out::println);
    }
}
