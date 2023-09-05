package 문자스트림;

import java.io.*;

// Writer : 문자열 기반 출력 Stream 최상위 추상 클래스
// Reader : 문자열 기반 입력 Stream 최상위 추상 클래스
public class CharStreamEx {
    public static void main(String[] args) throws IOException {
//        Writer writer = new FileWriter("test.txt");
//        char[] data = "James".toCharArray();
//        for (int i = 0; i < data.length; i++){
//            writer.write(data[i]);
//        }
//        writer.write(data);
//        writer.flush(); // 버퍼 지우기
//        writer.close();
        Reader reader = new FileReader("test.txt");
        while (true){
            int readData = reader.read();
            if (readData == -1) break;
            System.out.println((char)readData);
        }
        reader.close();
    }
}
