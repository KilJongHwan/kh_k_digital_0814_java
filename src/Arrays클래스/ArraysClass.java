package Arrays클래스;
// Arrays 클래스는 배열을 다루기 위한 다양한 메소드가 포함되어 있다.

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArraysClass {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 4, 7, 8, 9, 2, 1};   // Collections 프레임 워크 사용 하기 위해 참조 타입인 Integer 배열 사용
//        Arrays.sort(arr); // 오름 차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());   // 내림 차순 정렬
        for (int a : arr) System.out.println(a);
        // 정렬 오버라이딩 : 재정의
    }
}
