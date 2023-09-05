package 파일복사하기;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        String originFileName = "src/파일복사하기/skull.jpg";
        String targetFileName = "d:/temp/Skeleton.jpg";

        FileInputStream fis = new FileInputStream(originFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readBytesNo;
        byte[] readBytes = new byte[100];
        while ((readBytesNo = fis.read(readBytes)) != -1){
            fos.write(readBytes, 0 ,readBytesNo);
        }
        fos.flush();
        fos.close();
        fis.close();
    }
}
