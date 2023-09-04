package 예외처리5;

import java.io.IOException;
import java.lang.reflect.Array;

// 예외처리 미루기
public class ExceptionEx5 {
    public static void main(String[] args) {
        IOSample test = new IOSample();
        try {
            test.input();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

}
class IOSample {
    private int num;

    public void input() throws IOException {
        num = System.in.read();
    }

    public void output() {
        System.out.println(num);
    }
}
