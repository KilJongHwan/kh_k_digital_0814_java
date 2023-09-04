package 스트림중개연산;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 생성된 스트림은 중간 연산을 통해 또 다른 스트림으로 변환 된다.
// 1. Filtering :
//  - filter() : 주어진 조건에 맞는 요소만으로 구성된 새로운 Stream 생성
//  - distinct() : 중복된 요소가 제거된 새로운 Stream 생성
// 2. Stream 변환 :
//  - map() : 해당 Stream 의 요소들을 함수의 인수로 전달하여, 그 반환값으로 이루어진 새로운 Stream 생성
//  - flatMap() : 각 요소를 변환하여 중첩된 Stream 들을 평면화하여 새로운 Stream 생성
// 3. 제한 :
//  - limit() : 해당 Stream 의 첫 번째 요소부터 전달된 개수만큼의 요소만으로 이루어진 새로운 Stream 생성
//  - skip() : 해당 Stream 의 첫 번째 요소부터 전달된 개수만큼의 요소를 제외한 나머지 요소만으로 이루어진 새로운 Strema 생성
// 4. 정렬 :
//  - sorted() : 해당 Stream 을 주어진 비교자를 이용하여 정렬
public class StreamMainEx4 {
    public static void main(String[] args) {
//        IntStream stream1 = IntStream.of(7,5,5,2,1,3,4,5,6);
//        IntStream stream2 = IntStream.of(7,5,5,2,1,3,4,5,6);
        // Stream 중복 요소 제거
//        stream1.distinct().forEach(e-> System.out.print(e + " "));
//        System.out.println();
        // 조건에 맞는 요소만으로 구성된 새로운 Stream 생성
//        stream2.filter(e-> e % 2 != 0).forEach(e->System.out.print(e + " "));
//        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
//        stream.map(String::length).forEach(e ->System.out.print(e + " "));
//        System.out.println();
//
//        Stream<String> stream3 = Stream.of("I study hard", "You study Java", "I am hungry");
//        stream3.flatMap(e->Stream.of(e.split(" "))).forEach(e->System.out.print(e + " "));
//        IntStream stream1 = IntStream.range(0,10);
//        IntStream stream2 = IntStream.range(0,10);
//        IntStream stream3 = IntStream.range(0,10);

        // 전달된 요소의 개수만 제외 : 0 ~ 3
//        stream1.skip(4).forEach(e -> System.out.print(e + " "));
//        System.out.println();
//        // 첫 번째 요소부터 전달된 개수만큼의 요소만큼 이루어진 새로운 Stream
//        stream2.limit(5).forEach(e -> System.out.print(e + " "));
//        System.out.println();
//        stream3.skip(5).limit(5).forEach( e -> System.out.print(e + " "));
        Stream<String> stream1 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        Stream<String> stream2 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        stream1.sorted().forEach(s -> System.out.print(s + " "));
        stream2.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));

    }
}
