package 스트림2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// 반복자 Stream forEach() : 내부 반복자, Stream 요소에 대한 순차 접근을 제공하며, 최종 연산에 해당
public class StreamMainEx2 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("james", 79),
                new Student("samuel", 70),
                new Student("sam", 65),
                new Student("kane", 55),
                new Student("jessy", 95)
        );
//        list.forEach(s->{
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + " : " + score);
//        });
//        list.parallelStream().forEach(s-> { // 내부 반복자를 이용한 병렬처리
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + " : " + score);
//        });
        double average = list.stream()  // Stream 생성
                .mapToInt(Student::getScore) // 메소드 참조, 중간 연산
                .average() // 중간 연산
                .orElse(0.0); // 최종 연산 만약 stream 이 비어 있으면 0.0 반환
        System.out.println("평균 점수 : " + average);
        int sum = 0;
        IntStream stream = IntStream.rangeClosed(1,100);    // 1 ~ 100 까지의 구성된 정수 스트림 생성
        System.out.println("합계 : " + stream.sum());
    }
}
class Student{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
