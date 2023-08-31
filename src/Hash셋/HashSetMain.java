package Hash셋;

import java.util.Arrays;
import java.util.HashSet;

// 증복 허용 하지 않음, 순서 보장 하지 않음, 수학의 집합과 유사한 개념
public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("Python");
        set.add("Java");    // add 안됨
        for (String e : set) System.out.println(e + " ");

    }
}
